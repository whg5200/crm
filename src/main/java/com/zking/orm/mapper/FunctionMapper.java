package com.zking.orm.mapper;

import com.zking.orm.model.Function;
import com.zking.orm.model.RoleFunction;

import java.util.List;

public interface FunctionMapper {
    int deleteByPrimaryKey(Integer functionId);

    int insert(Function record);

    int insertSelective(Function record);

    Function selectByPrimaryKey(Integer functionId);

    int updateByPrimaryKeySelective(Function record);

    int updateByPrimaryKey(Function record);

    List<Function> list(Function record);
}