package com.lagou.edu.mvcframework.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 */
public interface Interceptor {
    boolean before(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse);
}
