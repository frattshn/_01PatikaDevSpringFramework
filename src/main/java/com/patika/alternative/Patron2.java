package com.patika.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron2 implements IPatron {
    @Override
    public String surum(String data) {
        return "Patron2 - Sürüm " + data;
    }
}
