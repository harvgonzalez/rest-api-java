package com.restfulws.springmvvjpa.restfulappspring.security;

import com.restfulws.springmvvjpa.restfulappspring.SpringApplicationContext;

public class SecurityConstants {
    public static final long EXPIRATION_TIME = 864000000; // 10 DAYS
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users";
    //public static final String TOKEN_SECRET = "jEjf6dsSfsD423Gfd";

    public static String getTokenSecret(){
        AppProperties appProperties = (AppProperties) SpringApplicationContext.getBean("AppProperties");

        return appProperties.getTokenSecret();
    }
}
