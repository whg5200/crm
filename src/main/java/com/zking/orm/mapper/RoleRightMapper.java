package com.zking.orm.mapper;

import com.zking.orm.model.RoleRight;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRightMapper {
    int deleteByPrimaryKey(Integer rfId);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Integer rfId);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}