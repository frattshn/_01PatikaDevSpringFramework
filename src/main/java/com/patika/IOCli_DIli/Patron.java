package com.patika.IOCli_DIli;

public class Patron implements IPatron{


    @Override
    public String surum(String data) {
        return "Sürüm " + data;
    }
}
