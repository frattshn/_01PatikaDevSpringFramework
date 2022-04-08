package com.patika.qualifier;

import javax.enterprise.inject.Alternative;

//@Alternative
@QualifierMultiple
public class Patron2 implements IPatron {
    @Override
    public String surum(String data) {
        return "Multiple1 - Sürüm " + data;
    }
}
