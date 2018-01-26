package com.zking.orm.controller;

import com.zking.orm.biz.IRightBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RightController {

    @Autowired
    private IRightBiz iRightBiz;

}
