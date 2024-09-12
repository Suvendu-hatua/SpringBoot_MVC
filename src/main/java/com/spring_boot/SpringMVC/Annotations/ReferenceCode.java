package com.spring_boot.SpringMVC.Annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = ReferenceCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ReferenceCode {
    //define value()
    public String value() default "VWITS";
    //define message()
    public String message() default "Must be Start with VWITS";
    //define groups()
    Class<?>[] groups() default {};
    //define payloads()
    Class<? extends Payload>[] payload() default {};
}
