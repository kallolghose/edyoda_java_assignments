package com.edyoda.portal.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String> {

    private String startWithString; //REF

    @Override
    public void initialize(CourseCode courseCode) {
        startWithString = courseCode.value();
    }

    /**
     *
     * @param str : This is basically the dataMember on which the annotation is being added.
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(String str, ConstraintValidatorContext constraintValidatorContext) {
        if(Objects.nonNull(str)){
            return str.startsWith(startWithString);
        }
        return true;
    }
}
