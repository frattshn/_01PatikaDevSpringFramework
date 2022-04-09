package com.patika.aop.stereotype;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Stereotype
@Target({TYPE, METHOD, FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented

@Named
@ApplicationScoped

public @interface MyStereotype {
}
