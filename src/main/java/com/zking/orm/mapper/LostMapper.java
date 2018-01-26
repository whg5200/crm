package com.zking.orm.mapper;

import com.zking.orm.model.Lost;

public interface LostMapper {
    int deleteByPrimaryKey(Integer lstId);

    int insert(Lost record);

    int insertSelective(Lost record);

    Lost selectByPrimaryKey(Integer lstId);

    int updateByPrimaryKeySelective(Lost record);

    int updateByPrimaryKey(Lost record);
}