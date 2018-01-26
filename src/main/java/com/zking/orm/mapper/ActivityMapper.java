package com.zking.orm.mapper;

import com.zking.orm.model.Activity;

public interface ActivityMapper {
    int deleteByPrimaryKey(Integer atvId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer atvId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}