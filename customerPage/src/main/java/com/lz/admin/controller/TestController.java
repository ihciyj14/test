package com.lz.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuzheng on 2015/10/22.
 */
@Controller
public class TestController {

    @RequestMapping("/index")
    public String testRedirect(){
        System.out.println("[testRedirect] enter");
        return "redirect:index.jsp";
    }
    @RequestMapping("/index2")
    public String testFarword(){
        System.out.println("[testFarword] enter");
        return "index";
    }
}
