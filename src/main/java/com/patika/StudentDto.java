package com.patika;

import lombok.*;

//Data Transfer Object
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    private Long studentId;
    private String studentName;
    private String studentSurname;

}
