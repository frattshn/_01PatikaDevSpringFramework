package com.patika.cdi;

import com.patika.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "newtuto")
@ApplicationScoped

public class _04_New {

    @Getter
    @Inject
    private String tuketilenData;

    //Üretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto){
        studentDto = StudentDto.builder()
                .studentId(0L)
                .studentName("Student Adı")
                .build();
        return studentDto.getStudentName();
    }



}
