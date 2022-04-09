package com.patika.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import java.util.Locale;

@Decorator
public class EvDecorator implements IEv {


    private @Inject @Delegate
    IEv iev;

    @Override
    public String boyama(String data) {
        System.out.println("Decorator buradaydı");
        String dataInformation = iev.boyama(data);
        if(dataInformation.equals("kodluyoruz")){
            dataInformation = dataInformation.toUpperCase(Locale.ROOT);
        }
        return dataInformation;
    }
}
