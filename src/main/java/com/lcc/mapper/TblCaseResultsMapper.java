package com.lcc.mapper;

import com.lcc.pojo.TblCaseResults;
import com.lcc.pojo.TblCaseResultsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblCaseResultsMapper {
    int countByExample(TblCaseResultsExample example);

    int deleteByExample(TblCaseResultsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblCaseResults record);

    int insertSelective(TblCaseResults record);

    List<TblCaseResults> selectByExample(TblCaseResultsExample example);

    TblCaseResults selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblCaseResults record, @Param("example") TblCaseResultsExample example);

    int updateByExample(@Param("record") TblCaseResults record, @Param("example") TblCaseResultsExample example);

    int updateByPrimaryKeySelective(TblCaseResults record);

    int updateByPrimaryKey(TblCaseResults record);
    
    List<TblCaseResults> selectByExamples(@Param("page")int page,@Param("limit")int limit);
    
    Long selectTotal();
}