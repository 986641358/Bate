package com.lcc.service;

import com.lcc.pojo.TblCase;

public interface CaseService {
	//添加用例接口
	public String addCase(TblCase tblCase);
	
	//分页获取用例
	public String getCaseList(int page,int limit);
	
}
