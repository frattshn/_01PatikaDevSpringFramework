package com.patika.qualifier2;

//@Alternative
@QualifierMultiple2(Secenek.UCUNCU)
public class Patron4 implements IPatron {
    @Override
    public String surum(String data) {
        return "Multiple3 - Sürüm " + data;
    }
}
