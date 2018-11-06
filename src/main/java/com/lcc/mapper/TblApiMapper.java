package com.lcc.mapper;

import com.lcc.pojo.TblApi;
import com.lcc.pojo.TblApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblApiMapper {
    int countByExample(TblApiExample example);

    int deleteByExample(TblApiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TblApi record);

    int insertSelective(TblApi record);

    List<TblApi> selectByExample(TblApiExample example);

    TblApi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TblApi record, @Param("example") TblApiExample example);

    int updateByExample(@Param("record") TblApi record, @Param("example") TblApiExample example);

    int updateByPrimaryKeySelective(TblApi record);

    int updateByPrimaryKey(TblApi record);
    
    long selectTotal();
}