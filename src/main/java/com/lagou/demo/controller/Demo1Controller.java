package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;
import lombok.SneakyThrows;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@LagouController
@LagouRequestMapping("/demo1")
@Security({"zhangsan", "albert"})
public class Demo1Controller {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     *
     * @param request
     * @param response
     * @param username
     * @return
     */
    @SneakyThrows
    @LagouRequestMapping("/query")
    public String query(HttpServletRequest request, HttpServletResponse response, String username) {
        response.getWriter().write(demoService.get(username));
        return demoService.get(username);
    }

    @SneakyThrows
    @LagouRequestMapping("/query2")
    @Security({"lisi"})
    public String query2(HttpServletRequest request, HttpServletResponse response, String username) {
        response.getWriter().write(demoService.get(username));
        return demoService.get(username);
    }

}
