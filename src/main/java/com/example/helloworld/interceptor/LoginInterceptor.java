package com.example.helloworld.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    /*
    * 在请求处理之前进行调用（Controller方法调用之前）
    */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        /*if () {
            System.out.println("通过");
            return true;
        } else {
            System.out.println("不通过");
            return false;
        }*/
        System.out.println("LoginInterceptor");
        return true;
    }
}
