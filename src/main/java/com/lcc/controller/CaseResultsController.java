package com.lcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcc.pojo.TblCase;
import com.lcc.service.CaseResultsService;
import com.lcc.utils.Url;

@Controller
public class CaseResultsController {
	
	@Autowired
	private CaseResultsService caseResultsService;
	
	//启动执行
	@RequestMapping(value="start",produces = Url.STRINGTOJSON)
	@ResponseBody
	public String StartExecution(TblCase tblCase){
		String str = caseResultsService.StartExecution(tblCase);
		return str;
	}
	
	/**
	 * 批量执行入口
	 * @return
	 */
	@RequestMapping(value="batchStart",produces = Url.STRINGTOJSON)
	@ResponseBody
	public String BatchStartExecution(String ids){
		String str = caseResultsService.batchStart(ids);
		return str;
	}
	//打开测试结果页面
	@RequestMapping("caseresults/list.html")
	public String showCaseResultsPage(){
		return "caseresults/list";
	}
	
	//查询测试结果
	@RequestMapping(value="caseresults/list.html",method=RequestMethod.POST,produces = Url.STRINGTOJSON)
	@ResponseBody
	public String getCaseResultsList(int page,int limit){
		String str = caseResultsService.getCaseResultList(page, limit);
		return str;
	}
}
