package com.patika.aop.interceptor;

import javax.interceptor.InterceptorBinding;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.*;

@InterceptorBinding
@Inherited
@Target({TYPE, METHOD})
@Retention(RUNTIME)
@Documented
public @interface InterceptorYolKesici {

}
