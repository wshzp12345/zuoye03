package com.lagou.edu.mvcframework.interceptor;

import com.lagou.edu.mvcframework.security.UserNameAccessRule;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class GetParamUserNameSecurityInterceptor extends SecurityInterceptor {
    private UserNameAccessRule userNameAccessRule;
    public GetParamUserNameSecurityInterceptor(UserNameAccessRule userNameAccessRule) {
        this.userNameAccessRule = userNameAccessRule;
    }

    @Override
    public boolean interceptor(HttpServletRequest httpServletRequest) {
        Map<String, String[]> parameterMap = httpServletRequest.getParameterMap();
        String[] usernames = parameterMap.get("username");
        if (usernames.length == 0) return false;
        return userNameAccessRule.getUsernames().contains(usernames[0]);
    }
}
