package com.lcc.service.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcc.mapper.TblAggregateReportMapper;
import com.lcc.mapper.TblCaseMapper;
import com.lcc.mapper.TblCaseResultsMapper;
import com.lcc.mapper.TblPublicParametersMapper;
import com.lcc.pojo.TblAggregateReport;
import com.lcc.pojo.TblCase;
import com.lcc.pojo.TblCaseResults;
import com.lcc.pojo.TblPublicParameters;
import com.lcc.service.CaseResultsService;
import com.lcc.utils.ApiResult;
import com.lcc.utils.HttpClientUtil;
import com.lcc.utils.JsonUtils;
import com.lcc.utils.LayuiData;
import com.lcc.utils.Sign;
import com.lcc.utils.SuccessResult;

@Service
public class CaseResultsServiceImpl implements CaseResultsService{
	
	@Autowired
	private TblPublicParametersMapper tblPublicPar;		//公共参数接口
	
	@Autowired
	private TblCaseMapper tblCase;	//用例接口
	
	@Autowired
	private TblCaseResultsMapper tblCaseResults;	//记录结果接口
	
	@Autowired
	private TblAggregateReportMapper tblAggregate;
	
	/**
	 * @author lcc
	 * @id TestCase id
	 */
	@Override
	public String StartExecution(TblCase tblCase) {
		// TODO Auto-generated method stub
		//生成签名、提交参数
		Map<String,String> map = new TreeMap<>();
		/**
		 * 一、查询公共参数
		 * 1.创建查询条件
		 * 2.创建返回对象
		 * 3.执行查询
		 */
		List<TblPublicParameters> parlist;
		parlist = tblPublicPar.selectByExamples(0,1);
		/**
		 * 二、查询用例
		 */
		TblCase caseList;
		caseList = this.tblCase.selectByPrimaryKeys(tblCase.getId());
		//动态添加参数
		String parameters = caseList.getParameters();
		String keyValues [] = parameters.split(":");
		
		TblPublicParameters tblPublicParameters = parlist.get(0);
		map.put("loginName", "18516873457");
		map.put("loginkey", "a123456");
		String unidcode;
		try {
			unidcode = HttpClientUtil.doPost("http://login.xinyitest.cn/Login/unifylogin", map).substring(45,77);
			tblPublicParameters.setUnidcode(unidcode);
			tblPublicParameters.setUtime(new Date());
		} catch (Exception e) {
			// TODO: handle exception
			return JsonUtils.objectToJson(ApiResult.build(1,"服务器异常" ,"异常"));
		}
		
		map.clear();
		tblPublicPar.updateByPrimaryKeySelective(tblPublicParameters);
		map.put("appid", tblPublicParameters.getAppid());
		//需要判断是否需要token（目前两个接口不需要传递token）
		if(!(caseList.getMethod().equals("public.infoBase.getUserMerchantList"))&&!(caseList.getMethod().equals("public.infoBase.getAuthorize"))){
			map.put("xinyitoken", tblPublicParameters.getXinyitoken());
		}
		map.put("method", caseList.getMethod());
		map.put("timestamp", System.currentTimeMillis()/1000+"");
		map.put("version", tblPublicParameters.getVersion());
		//添加动态参数
		System.out.println(keyValues.length+"-----------------------------------");
		if(keyValues.length>1){
			for(int i=0;i<keyValues.length;i+=2){
				map.put(keyValues[i], keyValues[i+1]);
			}
		}
		
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
	    while (it.hasNext()) {
	    	Map.Entry<String, String> entry = it.next();
	    	if(entry.getKey().equals("unidcode")){
	    		map.put("unidcode", unidcode);
	    	}
	    }
		//需要判断secret的值
	    if((caseList.getMethod().equals("public.infoBase.getUserMerchantList"))||(caseList.getMethod().equals("public.infoBase.getAuthorize"))){
	    	map.put("secret", tblPublicParameters.getStaticsecret());
	    }else{
	    	map.put("secret", tblPublicParameters.getSecret());
	    }
		
		//设置签名
		map.put("sign", Sign.getSign(map,true,true));
		//提交数据不需要secret
		map.remove("secret");
		//请求且接收返回
		String str = HttpClientUtil.doPost(tblPublicParameters.getTesturl(),map);
		//判断如果是获取商户授权信息接口，将返回的信息token、私钥持久化
		Iterator<Map.Entry<String, String>> its = map.entrySet().iterator();
		while (its.hasNext()) {
			Map.Entry<String, String> entry = its.next();
		    if(entry.getValue().equals("public.infoBase.getAuthorize")){
		    	tblPublicParameters.setSecret(str.substring(64,96));
		    	tblPublicParameters.setXinyitoken(str.substring(112,152));
		    	tblPublicPar.updateByPrimaryKeySelective(tblPublicParameters);
		    }
		}
		System.out.println("返回数据"+str);
		
		
		//记录执行结果
		TblCaseResults tblCaseResults = new TblCaseResults();
		tblCaseResults.setCid(tblCase.getId());
		tblCaseResults.setIssuccess("1");
		tblCaseResults.setActualresults(str);
		//如果没有返回data判断执行失败
		if(str.indexOf("data")==-1){
			tblCaseResults.setIsadopt("0");
		}else{
			tblCaseResults.setIsadopt("1");
		}
		tblCaseResults.setStarttime(new Date());
		//添加到结果记录表里
		this.tblCaseResults.insert(tblCaseResults);
		
		//封装返回结果
		SuccessResult successRes = JsonUtils.jsonToPojo(str, SuccessResult.class);
		//返回最终结果
		return JsonUtils.objectToJson(ApiResult.build(1,successRes.getMsg() ,str));		
	}
	
	//获取测试结果
	@Override
	public String getCaseResultList(int page, int limit) {
		// TODO Auto-generated method stub
		page = (page-1)*limit;
		LayuiData data = new LayuiData();
		List<TblCaseResults> list = tblCaseResults.selectByExamples(page,limit);
		data.setCode(0);
		data.setMsg("查询成功！");
		data.setCount(tblCaseResults.selectTotal());
		data.setData(list);
		System.out.println(list.size());
		return JsonUtils.objectToJson(data);
	}

	@Override
	public String batchStart(String ids) {
		// TODO Auto-generated method stub
		String res = null;
		TblAggregateReport tblAggregate = new TblAggregateReport();
		TblCase tblCase = new TblCase();
		String str[] = ids.split(",");
		int successnum = 0;
		int failurenum = 0;
		for(int i=0;i<str.length;i++){  
			tblCase.setId(Integer.parseInt(str[i].trim()));
			res = StartExecution(tblCase);
			ApiResult result = JsonUtils.jsonToPojo(res, ApiResult.class);
			if(result.getStatus()==1){
				successnum++;
			}else{
				failurenum++;
			}
			
		}
		tblAggregate.setBatchnum(99);
		tblAggregate.setSuccessnum(successnum);
		tblAggregate.setFailurenum(failurenum);
		tblAggregate.setCtime(new Date());
		tblAggregate.setCtime(new Date());
		this.tblAggregate.insert(tblAggregate);
		return JsonUtils.objectToJson(ApiResult.build(1,"批量执行成功！" ,str));
	}
	
}
