package com.jinll.jin.pms.mapper;

import com.jinll.jin.pms.pojo.Attr;
import com.jinll.jin.pms.pojo.AttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttrMapper {
    long countByExample(AttrExample example);

    int deleteByExample(AttrExample example);

    int insert(Attr record);

    int insertSelective(Attr record);

    List<Attr> selectByExample(AttrExample example);

    int updateByExampleSelective(@Param("record") Attr record, @Param("example") AttrExample example);

    int updateByExample(@Param("record") Attr record, @Param("example") AttrExample example);
}