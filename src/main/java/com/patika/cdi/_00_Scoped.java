package com.patika.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

//Kapsam
@Named
//@ApplicationScoped //Bütün uygulama boyunca ve bütün kullanıcılar için yaşıyor.
//@RequestScoped //Bir istek boyunca yaşar.
//@SessionScoped //Bir kullanıcı için yaşar ancak logout olduğunda biter.(Serializable implement ister)
//@Dependent //Bukalemun.. Çağırılan yere göre karakter değiştirir.
//@ConversationScoped //Belli istek boyunca yaşar.(Serializable implement ister)
//@SessionScoped // Bean bir instance olmasını sağlamak için yaşar.
public class _00_Scoped {
    /*
    Oluşturulan objenin yaşam süresini belirler.
    Seçilen scope yapısı, performansı etkiler(pozitif veya negatif).

     */
}
