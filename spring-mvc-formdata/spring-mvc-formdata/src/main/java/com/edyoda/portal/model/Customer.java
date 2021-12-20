package com.edyoda.portal.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

    private String firstName;

    @NotNull(message = "Field Cannot Be Empty")
    @Size(min = 1, message = "Field Cannot Be Empty")
    private String lastName;

    @NotNull(message = "Field Cannot Be Empty")
    @Min(value = 0, message = "Field should be greater than or equal to 0")
    @Max(value = 20, message = "Field should be less than or equal to 20")
    private Integer freePasses;

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
