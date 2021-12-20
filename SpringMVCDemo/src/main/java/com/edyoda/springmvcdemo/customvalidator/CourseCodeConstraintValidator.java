package com.edyoda.springmvcdemo.customvalidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String prefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        prefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s != null){
            return s.startsWith(prefix);
        }
        return true;
    }
}
