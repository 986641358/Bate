package com.lcc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.lcc.mapper.TblApiMapper;
import com.lcc.pojo.TblApi;
import com.lcc.pojo.TblApiExample;
import com.lcc.service.ApiService;
import com.lcc.utils.ApiResult;
import com.lcc.utils.JsonUtils;
import com.lcc.utils.LayuiData;

@Service
public class ApiServiceImpl implements ApiService {
	
	@Autowired
	private TblApiMapper apiMapper;
	
	//添加
	@Override
	public String addApi(TblApi api) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			i = apiMapper.insert(api);
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
	//分页查询
	@Override
	public String getApiListByPage(int page, int limit) {
		//创建返回对象
		LayuiData data = new LayuiData();
		//创建查询条件
		TblApiExample example = new TblApiExample();
		//分页处理
		PageHelper.startPage(page, limit);
		List<TblApi> list;
		try {
			list = apiMapper.selectByExample(example);
		} catch (Exception e) {
		// TODO: handle exception
			e.printStackTrace();
			return JsonUtils.objectToJson(ApiResult.build(2, "数据库操作异常！"));
		}
		data.setCode(0);
		data.setMsg("查询成功！");
		data.setCount(apiMapper.selectTotal());
		data.setData(list);
		return JsonUtils.objectToJson(data);
	}
	@Override
	public String getApiList() {
		//创建查询条件
		TblApiExample example = new TblApiExample();
		List<TblApi> list =null;
		try {
			list = apiMapper.selectByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return JsonUtils.objectToJson(list);
	}

}
