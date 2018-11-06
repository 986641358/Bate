package com.lcc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcc.pojo.TblPublicParameters;
import com.lcc.service.PublicParameters;
import com.lcc.utils.Url;
import com.lcc.utils.View;

@Controller
public class PublicParametersController {
	
	@Autowired
	private PublicParameters publicPar;
	//打开添加公共参数页面
	@RequestMapping(Url.PUBLICPARAMETERSADD)
	public String showAddPublicParametersPage(){
		return View.PUBLICPARAMETERSADD;
	}
	
	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showAllPage(){
		return "index";
	}
	
	@RequestMapping(value=Url.PUBLICPARAMETERSADD,method=RequestMethod.POST)
	@ResponseBody
	public String addPublicParameters(TblPublicParameters publicPar){
		String res = this.publicPar.addPublicParameters(publicPar);
		return res;
	}
	
	//打开公共参数列表
	@RequestMapping(Url.PUBLICPARAMETERSLIST)
	public String showPublicParametersListPage(){
		return View.PUBLICPARAMETERSLIST;
	}
	
	@RequestMapping(value=Url.PUBLICPARAMETERSLIST,method=RequestMethod.POST,produces = Url.STRINGTOJSON)
	@ResponseBody
	public String getPublicParametersList(int page,int limit,HttpServletRequest request){
		Cookie[] cookie = request.getCookies();
		System.out.println(cookie.length+"这是cookie长度");
		if(cookie.length>0) {
			for(int i=0;i<cookie.length;i++) {
				System.out.println(cookie[i].getName()+"这里接口里的日志！"+cookie[i].getValue());
			}
		}else {
			System.out.println("没有取到cookie");
		}
		String res = this.publicPar.getPublicParameters(page, limit);
		return res;
	}
	
}
