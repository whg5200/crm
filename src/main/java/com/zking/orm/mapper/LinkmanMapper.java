package com.zking.orm.mapper;

import com.zking.orm.model.Linkman;

public interface LinkmanMapper {
    int deleteByPrimaryKey(Integer lkmId);

    int insert(Linkman record);

    int insertSelective(Linkman record);

    Linkman selectByPrimaryKey(Integer lkmId);

    int updateByPrimaryKeySelective(Linkman record);

    int updateByPrimaryKey(Linkman record);
}