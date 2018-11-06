package com.lcc.service;

import com.lcc.pojo.TblCase;

public interface CaseResultsService {
	//批量执行用例
	public String batchStart(String ids);
	
	//执行用例
	public String StartExecution(TblCase tblCase);
	
	//获取结果列表
	public String getCaseResultList(int page,int limit);
}
