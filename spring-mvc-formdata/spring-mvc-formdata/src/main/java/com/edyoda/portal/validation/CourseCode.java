package com.edyoda.portal.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    String value() default "MH";
    String message() default "Course Code should start with MH";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
