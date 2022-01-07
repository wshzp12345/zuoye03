package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@LagouController
@LagouRequestMapping("/demo")
public class DemoController {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param username
     * @return
     */
    @LagouRequestMapping("/query")
    @Security({"zhangsan","albert"})
    public String query(HttpServletRequest request, HttpServletResponse response,String username) {
        return demoService.get(username);
    }


    @LagouRequestMapping("/select")
    @Security({"zhangsan"})
    public String query2(HttpServletRequest request, HttpServletResponse response,String username) {
        return demoService.get(username);
    }

}
