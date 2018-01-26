package com.zking.orm.mapper;

import com.zking.orm.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer usrId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer usrId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}