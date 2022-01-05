package com.ghoseka.crm.service;

import com.ghoseka.crm.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
    void saveCustomer(Customer customer);

}
