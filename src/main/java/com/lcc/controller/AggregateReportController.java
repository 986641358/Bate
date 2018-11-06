package com.lcc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lcc.pojo.Series;
import com.lcc.service.AggregateReport;
import com.lcc.utils.Aggregate;
import com.lcc.utils.JsonUtils;
import com.lcc.utils.Url;
/**
 * 
 * @author xy
 *
 */
@Controller
public class AggregateReportController {
	
	@Autowired
	private AggregateReport aggregateReport;
	
	@RequestMapping("aggregatereport/list.html")
	public String showAggregateReportPage(){
		return "aggregatereport/list";
	}
	
	@RequestMapping(value="aggregatereport/list.html",method=RequestMethod.POST,produces = Url.STRINGTOJSON)
	@ResponseBody
	public String getAggregateReportPage(){
		String str = aggregateReport.getAggregateReport();
		/*Aggregate aggregate = new Aggregate();
		
		Series series = new Series();
		Series series1 = new Series();
		
		List<String> list = new ArrayList<>();
		List<String> list1 = new ArrayList<>();
		
		list.add("5");
		
		list1.add("15");
		
		series.setName("成功");
		series.setType("bar");
		series.setData(list);
		
		List<String> legend = new ArrayList<>();
		legend.add("成功");
		legend.add("失败");
		//"衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"
		List<String> xAxis = new ArrayList<>();	
		xAxis.add("执行记录");

		List<Series> seriesList = new ArrayList<>();
		seriesList.add(series);
		
		series1.setName("失败");
		series1.setType("bar");
		series1.setData(list1);
		seriesList.add(series1);
		
		
		aggregate.setCode(1);
		aggregate.setMsg("查询成功！");
		aggregate.setText("测试动态数据");
		aggregate.setLegend(legend);
		aggregate.setxAxis(xAxis);
		aggregate.setSeries(seriesList);*/
		return str;
	}
}
