package com.lcc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcc.mapper.TblAggregateReportMapper;
import com.lcc.pojo.Series;
import com.lcc.pojo.TblAggregateReport;
import com.lcc.service.AggregateReport;
import com.lcc.utils.Aggregate;
import com.lcc.utils.JsonUtils;

/**
 * 
 * @author Lcc
 *
 */
@Service
public class AggregateReportImpl implements AggregateReport{
	
	@Autowired
	private TblAggregateReportMapper tblAggregate;
	
	/**
	 *	获取最新的批量执行报告 
	 */
	@Override
	public String getAggregateReport() {
		// TODO Auto-generated method stub
		List<TblAggregateReport> daoRest = new ArrayList<TblAggregateReport>();
		daoRest = tblAggregate.select();
		
		Aggregate aggregate = new Aggregate();
		
		Series series = new Series();
		Series series1 = new Series();
		
		List<Integer> successnum = new ArrayList<>();
		List<Integer> failurenum = new ArrayList<>();
		
		successnum.add(daoRest.get(0).getSuccessnum());
		
		failurenum.add(daoRest.get(0).getFailurenum());
		
		series.setName("成功");
		series.setType("bar");
		series.setData(successnum);
		
		series1.setName("失败");
		series1.setType("bar");
		series1.setData(failurenum);
		
		//设置图例
		List<String> legend = new ArrayList<>();
		legend.add("成功");
		legend.add("失败");

		//设置横轴
		List<String> xAxis = new ArrayList<>();	
		xAxis.add("执行记录");

		List<Series> seriesList = new ArrayList<>();
		
		seriesList.add(series);
		seriesList.add(series1);
		
		
		aggregate.setCode(1);
		aggregate.setMsg("查询成功！");
		aggregate.setText("测试动态数据");
		aggregate.setLegend(legend);
		aggregate.setxAxis(xAxis);
		aggregate.setSeries(seriesList);
		
		return JsonUtils.objectToJson(aggregate);
	}
	
}
