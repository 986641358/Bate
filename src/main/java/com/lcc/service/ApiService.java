package com.lcc.service;

import com.lcc.pojo.TblApi;

public interface ApiService {
	//添加API
	public String addApi(TblApi api);
	//查询API列表
	public String getApiListByPage(int page,int limit);
	
	//查询API列表不分页
	public String getApiList();
}
