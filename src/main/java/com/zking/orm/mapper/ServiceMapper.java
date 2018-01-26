package com.zking.orm.mapper;

import com.zking.orm.model.Service;

public interface ServiceMapper {
    int deleteByPrimaryKey(Integer svrId);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Integer svrId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}