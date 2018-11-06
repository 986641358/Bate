package com.lcc.mapper;

import com.lcc.pojo.TblCase;
import com.lcc.pojo.TblCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblCaseMapper {
    int countByExample(TblCaseExample example);

    int deleteByExample(TblCaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblCase record);

    int insertSelective(TblCase record);

    List<TblCase> selectByExample(TblCaseExample example);

    TblCase selectByPrimaryKey(Integer id);
    
    TblCase selectByPrimaryKeys(Integer id);

    int updateByExampleSelective(@Param("record") TblCase record, @Param("example") TblCaseExample example);

    int updateByExample(@Param("record") TblCase record, @Param("example") TblCaseExample example);

    int updateByPrimaryKeySelective(TblCase record);

    int updateByPrimaryKey(TblCase record);
    
    //连表查询
    List<TblCase> selectByExamples(TblCaseExample example);
    
    //查询总条数
    long selectTotal();
}