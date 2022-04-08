package com.patika.qualifier2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi2")
@ApplicationScoped
public class Calisan {


    //Defaultta çalışacak olan
//    @Inject
//    private IPatron patron;

    //Istenen seçenek
    @Inject
    @QualifierMultiple2(Secenek.BIRINCI)
    private IPatron patron;

    public String getData(String data){
        return patron.surum(data);
    }
}
