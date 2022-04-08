package com.patika.qualifier2;

//@Alternative
@QualifierMultiple2(Secenek.BIRINCI)
public class Patron2 implements IPatron {
    @Override
    public String surum(String data) {
        return "Multiple1 - Sürüm " + data;
    }
}
