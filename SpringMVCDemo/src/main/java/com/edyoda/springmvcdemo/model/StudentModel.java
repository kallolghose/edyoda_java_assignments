package com.edyoda.springmvcdemo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

public class StudentModel {

    private String firstName;

    @NotNull(message = "is required")
    @Size(message = "is required")
    private String lastName;

    private String country;

    private String language;

    private String [] operatingSystem;

    private LinkedHashMap<String, String> countryOptions;

    public StudentModel(){
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("US", "USA");
        countryOptions.put("UK", "United Kingdom");
        countryOptions.put("IN", "India");
        countryOptions.put("CH", "China");
        countryOptions.put("CN", "Canada");
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
