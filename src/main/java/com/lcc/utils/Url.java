package com.lcc.utils;
/**
 * @see统一视图
 * @author Lcc
 *
 */
public class Url {
	//统一后缀
	public static final String SUFFIX = ".html";
	//统一列表
	public static final String LIST = "list" + SUFFIX,
			ADD = "add" + SUFFIX,
			DELETE = "delete" + SUFFIX,
			UPDATA = "updata" + SUFFIX,
			QUERY = "query" + SUFFIX,
			REMOVE = "remove" + SUFFIX,
			UPLOAD = "upload" + SUFFIX,
			STATUS = "status" + SUFFIX,
			SAVE = "save" + SUFFIX,
			BATCH = "batch" + SUFFIX,
			QUERYBATCH = "querybatch" + SUFFIX,
			VIEW = "view" + SUFFIX,
			JSON="json"+SUFFIX;
	
	//登录相关
	public static final String LOGIN_IN = "login/in" + SUFFIX;
	public static final String REDIT =  "login/redit" + SUFFIX;
	public static final String LOGIN_OUT = "login/out" + SUFFIX;
	
	//返回JSON格式处理乱码
	public static final String STRINGTOJSON = "text/html; charset=utf-8";
	
	//上传图片
	public static final String UPLOAD_PICTURE = "pictureupload/" + ADD;
	
	//公共参数
	public static final String PUBLICPARAMETERS = "publicparameters/";
	public static final String PUBLICPARAMETERSADD = PUBLICPARAMETERS + ADD;
	public static final String PUBLICPARAMETERSLIST = PUBLICPARAMETERS + LIST;
	
	//API
	public static final String API = "api/";
	public static final String APIADD = API + ADD;
	public static final String APILIST = API + LIST;
	public static final String APILISTBYPAGE = API + "byPage/" +LIST;	//api/byPage/list.html
	
	//用例相关
	public static final String CASE = "case/";
	public static final String CASEADD = CASE + ADD;
	public static final String CASELIST = CASE + LIST;
	public static final String UICASE = "uicase/";
	public static final String UICASEADD = UICASE + ADD;
	public static final String UICASELIST = UICASE + LIST;
}
