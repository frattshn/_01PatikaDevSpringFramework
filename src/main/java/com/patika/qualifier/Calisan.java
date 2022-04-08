package com.patika.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

//    @Inject
//    private IPatron patron;

    @Inject
    @QualifierMultiple
    private IPatron patron;

    public String getData(String data){
        return patron.surum(data);
    }
}
