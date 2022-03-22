package com.bits.jwtImpl.securityConstrains;

public class SecurityConstrains {

    public static final long EXPIRATION_TIME = 300000; // 5 minutes in milliseconds
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String JWT_TOKEN_HEADER = "jwt-token";
    public static final String TOKEN_CAN_NOT_BE_VERIFIED = "token cannot be verified";
    public static final String BITS_LLC = "bracits, LLC";
    public static final String BITS_ADMINISTRATION = "User management portal";
    public static final String AUTHORITIES = "Authorities";
    public static final String FORBIDDEN_MESSAGE = "You need to login to access this page";
    public static final String ACCESS_DENIED_MESSAGE = "You do not have permission to access this page";
    public static final String OPTIONS_HTTP_METHOD = "OPTIONS";
    public static final String[] PUBLIC_URLS = {
            "/home"
    };

}
