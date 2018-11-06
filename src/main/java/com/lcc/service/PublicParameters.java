package com.lcc.service;

import com.lcc.pojo.TblPublicParameters;

public interface PublicParameters {
	//添加公共参数
	public String addPublicParameters(TblPublicParameters publicPar);
	//获取公共参数列表
	public String getPublicParameters(int page,int limit);
}
