package com.lagou.edu.mvcframework.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class SecurityInterceptor implements Interceptor{
    public boolean before(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return interceptor(httpServletRequest);
    }
    public abstract boolean interceptor(HttpServletRequest httpServletRequest);
}
