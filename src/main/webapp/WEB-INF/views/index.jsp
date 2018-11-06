<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${ctx}/layui/css/layui.css">
<title>主页</title>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">API自动化测试平台</div>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item">
          <a class="" href="javascript:;">公共参数管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:showAddPublicparameters();">参数添加</a></dd>
            <dd><a href="javascript:showPublicParametersList();">参数列表</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">接口用例管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:showAddCase();">用例添加</a></dd>
            <dd><a href="javascript:showCaseList();">用例列表</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">UI-用例管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:showUiCaseList();">测试报告</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">API接口管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:showAddApi();">接口添加</a></dd>
            <dd><a href="javascript:showApiList();">接口列表</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">用例执行记录</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:showCaseResults();">记录列表</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">测试报告</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:showAggregatereport();">测试报告</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <iframe id="option" name="option" src="" style="overflow: visible;" scrolling="no" frameborder="no" width="100%" height="100%"></iframe>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © 版权所有-986641358@qq.com
  </div>
</div>
<script src="${ctx}/layui/layui.all.js"></script>
<script>
//JavaScript代码区域
//打开公共参数页面
function showPublicParametersList(){
	element=document.getElementById('option')
	element.src="publicparameters/list.html";
}
//打开添加公共参数页面
function showAddPublicparameters(){
	element=document.getElementById('option')
	element.src="publicparameters/add.html";
}
//打开接口用例管理页面
function showCaseList(){
	element=document.getElementById('option')
	element.src="case/list.html";
}
//打开UI用例管理页面
function showUiCaseList(){
	element=document.getElementById('option')
	element.src="uicase/list.html";
}
//打开用例添加页面
function showAddCase(){
	element=document.getElementById('option')
	element.src="case/add.html";
}
//打开API接口页面
function showApiList(){
	element=document.getElementById('option')
	element.src="api/list.html";
}
//打开API接口添加页面
function showAddApi(){
	element=document.getElementById('option')
	element.src="api/add.html";
}
//打开用例执行记录页面
function showCaseResults(){
	element=document.getElementById('option')
	element.src="caseresults/list.html";
}
//打开测试报告页面
function showAggregatereport(){
	element=document.getElementById('option')
	element.src="aggregatereport/list.html";
}


</script>
</body>
</html>