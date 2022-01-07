package com.lagou.edu.mvcframework.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * load rule from config files
 */
public class SecurityRulePropertiesLoader {
    private Properties properties;

    public SecurityRulePropertiesLoader(Properties properties){
        this.properties = properties;

    }

    public UserNameAccessRule load() {
        UserNameAccessRule userNameAccessRules = new UserNameAccessRule();

        return userNameAccessRules;
    }

}
