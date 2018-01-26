package com.zking.orm.biz.impl;

import com.zking.orm.biz.IRoleBiz;
import com.zking.orm.mapper.RoleMapper;
import com.zking.orm.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleBizImpl implements IRoleBiz {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> list(Role role) {
        return roleMapper.list(role);
    }
}
