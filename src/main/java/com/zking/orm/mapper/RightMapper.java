package com.zking.orm.mapper;

import com.zking.orm.model.Right;

import java.util.List;

public interface RightMapper {
    int deleteByPrimaryKey(Integer rightCode);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(Integer rightCode);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);

    List<Right> list(Right record);
}