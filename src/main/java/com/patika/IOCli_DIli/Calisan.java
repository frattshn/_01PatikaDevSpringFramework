package com.patika.IOCli_DIli;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "CDIliCalisan")
@ApplicationScoped
public class Calisan {

    @Inject
    private IPatron patron;

    public Calisan() {

    }

    public String getData(String data){
        return patron.surum(data);
    }
}
