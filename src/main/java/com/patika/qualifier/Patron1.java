package com.patika.qualifier;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

//@Alternative
@Default
public class Patron1 implements IPatron {
    @Override
    public String surum(String data) {
        return "Default - Sürüm " + data;
    }
}
