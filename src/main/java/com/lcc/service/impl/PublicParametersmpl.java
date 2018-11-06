package com.lcc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.lcc.mapper.TblPublicParametersMapper;
import com.lcc.pojo.TblPublicParameters;
import com.lcc.pojo.TblPublicParametersExample;
import com.lcc.service.PublicParameters;
import com.lcc.utils.ApiResult;
import com.lcc.utils.JsonUtils;
import com.lcc.utils.LayuiData;

@Service
public class PublicParametersmpl implements PublicParameters {
	
	@Autowired
	private TblPublicParametersMapper tblPublicPar;
	//添加公共参数
	@Override
	public String addPublicParameters(TblPublicParameters publicPar) {
		// TODO Auto-generated method stub
		//补全POJO
		publicPar.setCtime(new Date());
		publicPar.setUtime(new Date());
		int success=0;
		try {
			success = tblPublicPar.insert(publicPar);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return JsonUtils.objectToJson(ApiResult.build(2, "数据库操作异常！"));
		}
		if(success==1){
			return JsonUtils.objectToJson(ApiResult.build(1, "添加成功！"));
		}
		return JsonUtils.objectToJson(ApiResult.build(2, "数据库操作异常！"));
	}
	//获取公共参数列表
	@Override
	public String getPublicParameters(int page, int limit) {
		// TODO Auto-generated method stub
		//创建返回对象
		LayuiData data = new LayuiData();
		//创建查询条件
		TblPublicParametersExample example = new TblPublicParametersExample();
		//分页处理
		PageHelper.startPage(page, limit);
		List<TblPublicParameters> list;
		try {
			list = tblPublicPar.selectByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return JsonUtils.objectToJson(ApiResult.build(2, "数据库操作异常！"));
		}
		data.setCode(0);
		data.setMsg("查询成功！");
		data.setCount(tblPublicPar.selectTotal());
		System.out.println(tblPublicPar.selectTotal());
		data.setData(list);
		return JsonUtils.objectToJson(data);
	}

}
