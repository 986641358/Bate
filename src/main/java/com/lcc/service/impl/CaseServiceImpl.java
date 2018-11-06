package com.lcc.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.lcc.mapper.TblCaseMapper;
import com.lcc.pojo.TblCase;
import com.lcc.pojo.TblCaseExample;
import com.lcc.service.CaseService;
import com.lcc.utils.ApiResult;
import com.lcc.utils.JsonUtils;
import com.lcc.utils.LayuiData;
/**
 * 
 * @author xy
 *
 */
@Service
public class CaseServiceImpl implements CaseService {
	
	@Autowired 
	private TblCaseMapper caseMapper;
	
	/**
	 * 添加用例
	 * @param TbCase
	 * @return Json
	 */
	@Override
	public String addCase(TblCase tblCase) {
		//补全POJO
		tblCase.setCtime(new Date());
		tblCase.setUtime(new Date());
		//添加时统一设置为未执行
		tblCase.setIsadopt("2");
		int i=0;
		try {
			i = caseMapper.insert(tblCase);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return JsonUtils.objectToJson(ApiResult.build(2, "数据库操作异常！"));
		}
		if(i==1){
			return JsonUtils.objectToJson(ApiResult.build(1, "添加成功！"));
		}
		return JsonUtils.objectToJson(ApiResult.build(2, "数据库操作异常！"));
	}

	@Override
	public String getCaseList(int page, int limit) {
		//创建返回对象
		LayuiData data = new LayuiData();
		//创建查询条件
		TblCaseExample example = new TblCaseExample();
		//分页处理
		PageHelper.startPage(page, limit);
		List<TblCase> list;
		try {
			list = caseMapper.selectByExamples(example);
		} catch (Exception e) {
		// TODO: handle exception
			e.printStackTrace();
			return JsonUtils.objectToJson(ApiResult.build(2, "数据库操作异常！"));
		}
		data.setCode(0);
		data.setMsg("查询成功！");
		data.setCount(caseMapper.selectTotal());
		data.setData(list);
		return JsonUtils.objectToJson(data);
	}
	
}
