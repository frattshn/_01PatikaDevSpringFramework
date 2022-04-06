package com.patika.cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


// CDI ==> Bean
@Named(value = "namedTuto")
@ApplicationScoped
public class _01_Named {

    private Long namedId;
    private String namedData = "Merhabalara Named Cdi Bean";




}
