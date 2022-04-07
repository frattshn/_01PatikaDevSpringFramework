package com.patika.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {

    @Produces //Üretiyor
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("Html5");
        list.add("Css3");
        list.add("Js");
        list.add("React");
        list.add("Angular");
        return list;
    }

}
