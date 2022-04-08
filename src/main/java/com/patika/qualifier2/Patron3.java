package com.patika.qualifier2;

//@Alternative
@QualifierMultiple2(Secenek.IKINCI)
public class Patron3 implements IPatron {
    @Override
    public String surum(String data) {
        return "Multiple2 - Sürüm " + data;
    }
}
