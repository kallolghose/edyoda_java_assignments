package com.ghoseka.practice.copy;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Address {

    private String addressLine;
    private String state;

    public Address(String addressLine, String state) {
        this.addressLine = addressLine;
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format("%s %s", addressLine, state);
    }
}
