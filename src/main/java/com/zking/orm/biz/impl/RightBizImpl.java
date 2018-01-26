package com.zking.orm.biz.impl;

import com.zking.orm.biz.IRightBiz;
import com.zking.orm.mapper.RightMapper;
import com.zking.orm.model.Right;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RightBizImpl implements IRightBiz {
    @Autowired
    private RightMapper rightMapper;

    @Override
    public List<Right> list(Right right) {
        return rightMapper.list(right);
    }
}
