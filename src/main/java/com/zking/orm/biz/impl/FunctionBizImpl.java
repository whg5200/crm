package com.zking.orm.biz.impl;

import com.zking.orm.biz.IFunctionBiz;
import com.zking.orm.mapper.FunctionMapper;
import com.zking.orm.model.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunctionBizImpl implements IFunctionBiz {
    @Autowired
    private FunctionMapper functionMapper;

    @Override
    public List<Function> list(Function function) {
        return functionMapper.list(function);
    }
}
