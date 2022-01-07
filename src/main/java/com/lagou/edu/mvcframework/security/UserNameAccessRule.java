package com.lagou.edu.mvcframework.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserNameAccessRule {

    private String id;
    private Set<String> usernames;

}
