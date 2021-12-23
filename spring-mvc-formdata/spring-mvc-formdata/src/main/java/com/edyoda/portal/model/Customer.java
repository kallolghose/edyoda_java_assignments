package com.edyoda.portal.model;

import com.edyoda.portal.validation.CourseCode;

import javax.validation.constraints.*;


public class Customer {

    private String firstName;

    @NotNull(message = "Field Cannot Be Empty")
    @Size(min = 1, message = "Field Cannot Be Empty")
    private String lastName;

    @NotNull(message = "Field Cannot Be Empty")
    @Min(value = 0, message = "Field should be greater than or equal to 0")
    @Max(value = 20, message = "Field should be less than or equal to 20")
    private Integer freePasses;

    @Pattern(regexp = "^[0-9]{6}$", message = "Please enter a valid field")
    private String pincode;

    @CourseCode(value = "REF", message = "Course should start with REF")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }
}
