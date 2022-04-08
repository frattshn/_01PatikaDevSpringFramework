package com.patika.IOCsiz_DIsiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "CDIsizCalisan")
@ApplicationScoped
public class Calisan {

    private Patron patron;

    public Calisan() {
        this.patron = new Patron();
    }

    public String getData(String data){
        return patron.surum(data);
    }
}
