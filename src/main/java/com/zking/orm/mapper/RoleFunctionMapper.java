package com.zking.orm.mapper;

import com.zking.orm.model.RoleFunction;

import java.util.List;

public interface RoleFunctionMapper {
    int deleteByPrimaryKey(Integer rfId);

    int insert(RoleFunction record);

    int insertSelective(RoleFunction record);

    RoleFunction selectByPrimaryKey(Integer rfId);

    int updateByPrimaryKeySelective(RoleFunction record);

    int updateByPrimaryKey(RoleFunction record);

    List<RoleFunction> list(RoleFunction record);
}