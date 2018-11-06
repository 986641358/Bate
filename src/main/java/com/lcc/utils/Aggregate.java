package com.lcc.utils;

import java.util.List;

import com.lcc.pojo.Series;
/**
 * 
 * @author xy
 *
 */
public class Aggregate {
	private int code;
	private String msg;
	private String text;
	private List<?> legend;
	private List<?> xAxis;
	private List<Series> series;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<?> getLegend() {
		return legend;
	}
	public void setLegend(List<?> legend) {
		this.legend = legend;
	}
	public List<?> getxAxis() {
		return xAxis;
	}
	public void setxAxis(List<?> xAxis) {
		this.xAxis = xAxis;
	}
	public List<Series> getSeries() {
		return series;
	}
	public void setSeries(List<Series> series) {
		this.series = series;
	}
	
	
}
