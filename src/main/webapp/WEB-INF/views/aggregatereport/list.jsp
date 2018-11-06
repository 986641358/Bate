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
<link rel="icon" href="www.baidu.com/favicon.ico?t=20171027" type="image/x-icon"/>
<script type="text/javascript" src="${ctx}/layui/layui.all.js"></script>
<script type="text/javascript" src="${ctx}/layui/jquery.min.js"></script>
<script type="text/javascript" src="${ctx}/echarts/echarts.js"></script>
<title>图表测试</title>
</head>
<body>
	<div style="margin-left:10px;margin-top:10px">
		<div id="aggregatereport" style="width: 800px;height:550px;border: 1px solid #5eb878;">
			<div style="height: 45px;line-height: 45px;background: #5eb878;padding-left: 15px;">
				<p>记录统计</p>
			</div>
			<!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
	    	<div id="main" style="width: 800px;height:500px;"></div>
		</div>
	</div>
    <script type="text/javascript">
    var myChart = echarts.init(document.getElementById('main'));

    $.post('list.html').done(function (data) {
    	var objData = JSON.parse(data);
    	console.log(typeof(objData.series));
        myChart.setOption({
        	toolbox: {
                show: true,
                feature: {
                    dataZoom: {
                        yAxisIndex: 'none'
                    },
                    dataView: {readOnly: false},
                    magicType: {type: ['line', 'bar']},
                    restore: {},
                    saveAsImage: {}
                }
            },
            title: {
                text: objData.text
            },
            tooltip: {},
            legend: {
                data:objData.legend
            },
            xAxis: {
                data: objData.xAxis
            },
            yAxis: {},
            series: [
                objData.series[0],
                objData.series[1],    
            ]
           	
        });
    });
    </script>
</body>
</html>