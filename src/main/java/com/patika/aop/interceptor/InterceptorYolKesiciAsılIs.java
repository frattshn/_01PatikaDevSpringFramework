package com.patika.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsılIs {

    @AroundInvoke public Object log(InvocationContext context){
        System.out.println("İlk Hali : " + context.getMethod().getName());
        boolean isLogin = false; //true : önce login olmalı. yol kesici olan değişken
        Object isContinue = null; //yol kesilmezse devam edecek
        if(isLogin){
            //önce sisteme giriş yapsın
            System.out.println("Önce sisteme giriş yapsın");
            return null;
        }else{
            try {
                isContinue = context.proceed(); //devam etmesini sağlar
                System.out.println("Sonraki hali " + isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
            return isContinue;
        }
    }

}
