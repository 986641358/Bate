package com.lcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcc.pojo.TblCase;
import com.lcc.service.CaseService;
import com.lcc.utils.Url;
import com.lcc.utils.View;

@Controller
public class CaseController {
	
	@Autowired
	private CaseService caseService;
	
	@RequestMapping(Url.CASEADD)
	public String showCasePage(){
		return View.CASEADD;
	}
	
	@RequestMapping(value=Url.CASEADD,method=RequestMethod.POST)
	@ResponseBody
	public String addTestCase(TblCase tblCase){
		String res = caseService.addCase(tblCase);
		return res;
	}
	
	@RequestMapping(Url.CASELIST)
	public String showCaseList(){
		return View.CASELIST;
	}
	
	@RequestMapping(value=Url.CASELIST,method=RequestMethod.POST,produces = Url.STRINGTOJSON)
	@ResponseBody
	public String getTestCaseList(int page,int limit){
		String res = caseService.getCaseList(page, limit);
		return res;
	}
}
