package com.patika.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativeDI")
@ApplicationScoped
public class Calisan {

    @Inject
    private IPatron patron;

    public String getData(String data){
        return patron.surum(data);
    }
}
