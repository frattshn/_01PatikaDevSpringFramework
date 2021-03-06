package com.patika.aop.decorator;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "decoratorBean")
@ApplicationScoped
public class DecoratorBean {

    @Inject
    IEv iev;

    public String beanMethod(String data){
        return iev.boyama(data);
    }

}
