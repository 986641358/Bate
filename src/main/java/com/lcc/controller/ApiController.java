package com.lcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcc.pojo.TblApi;
import com.lcc.service.ApiService;
import com.lcc.utils.Url;
import com.lcc.utils.View;
/**
 * 
 * @author xy
 *
 */
@Controller
public class ApiController {
	
	@Autowired
	private ApiService api;
	
	/**
	 * 打开API添加页面
	 * @return	View
	 */
	@RequestMapping(Url.APIADD)
	public String showAddPublicParametersPage(){
		return View.APIADD;
	}
	
	//添加API
	@RequestMapping(value=Url.APIADD,method=RequestMethod.POST)
	@ResponseBody
	public String addApi(TblApi api){
		String res = this.api.addApi(api);
		return res;
	}
	
	//打开API列表
	@RequestMapping(Url.APILIST)
	public String showPublicParametersListPage(){
		return View.APILIST;
	}
		
	//获取API列表分页
	@RequestMapping(value=Url.APILISTBYPAGE,method=RequestMethod.POST,produces = Url.STRINGTOJSON)
	@ResponseBody
	public String getPublicParametersListByPage(int page,int limit){
		String res = this.api.getApiListByPage(page, limit);
		return res;
	}
	
	//获取API列表不分页
	@RequestMapping(value=Url.APILIST,method=RequestMethod.POST,produces = Url.STRINGTOJSON)
	@ResponseBody
	public String getPublicParametersList(){
		String res = this.api.getApiList();
		return res;
	}
}
