package com.ghoseka.practice.copy;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Getter @Setter
public class Person {

    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    //Perform Shallow Copy
    public Person(Person person){
        this.firstName = person.firstName;
        this.lastName = person.lastName;
        //this.address = person.address;
        this.address =
                new Address(person.getAddress().getAddressLine(),
                        person.getAddress().getState());
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", firstName, lastName, address.toString());
    }

    public List<Integer> integers(){
        return Collections.synchronizedList(new ArrayList<>());
    }
}
