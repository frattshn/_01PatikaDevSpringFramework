package com.patika.qualifier;

/*
@Alternative : Aynı anda sadece bir tane çalışıyor, diğerleri pasif durumda.
@Qualifier   : Aynı anda birden fazla çalışması için, ancak default olarak çalışacak olanı seçebiliriz.
 */

public interface IPatron {

    String surum(String data);

}
