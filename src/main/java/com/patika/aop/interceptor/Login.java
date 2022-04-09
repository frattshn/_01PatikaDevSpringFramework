package com.patika.aop.interceptor;

@InterceptorYolKesici
public class Login {

    public String isLogin(String data){
        return "isLogin : " + data;
    }

}
