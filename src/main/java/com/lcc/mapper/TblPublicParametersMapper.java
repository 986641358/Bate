package com.lcc.mapper;

import com.lcc.pojo.TblPublicParameters;
import com.lcc.pojo.TblPublicParametersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblPublicParametersMapper {
    int countByExample(TblPublicParametersExample example);

    int deleteByExample(TblPublicParametersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblPublicParameters record);

    int insertSelective(TblPublicParameters record);

    List<TblPublicParameters> selectByExample(TblPublicParametersExample example);
    
    List<TblPublicParameters> selectByExamples(@Param("page")int page,@Param("limit")int limit);

    TblPublicParameters selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblPublicParameters record, @Param("example") TblPublicParametersExample example);

    int updateByExample(@Param("record") TblPublicParameters record, @Param("example") TblPublicParametersExample example);

    int updateByPrimaryKeySelective(TblPublicParameters record);

    int updateByPrimaryKey(TblPublicParameters record);
    
    long selectTotal();
}