package com.lcc.mapper;

import com.lcc.pojo.TblAggregateReport;
import com.lcc.pojo.TblAggregateReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblAggregateReportMapper {
    int countByExample(TblAggregateReportExample example);

    int deleteByExample(TblAggregateReportExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblAggregateReport record);

    int insertSelective(TblAggregateReport record);

    List<TblAggregateReport> selectByExample(TblAggregateReportExample example);

    TblAggregateReport selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblAggregateReport record, @Param("example") TblAggregateReportExample example);

    int updateByExample(@Param("record") TblAggregateReport record, @Param("example") TblAggregateReportExample example);

    int updateByPrimaryKeySelective(TblAggregateReport record);

    int updateByPrimaryKey(TblAggregateReport record);
    
    List<TblAggregateReport> select();
}