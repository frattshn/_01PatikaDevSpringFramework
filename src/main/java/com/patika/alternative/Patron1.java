package com.patika.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements IPatron {
    @Override
    public String surum(String data) {
        return "Patron1 - Sürüm " + data;
    }
}
