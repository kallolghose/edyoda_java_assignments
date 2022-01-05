package com.edyoda.crm.service;

import com.edyoda.crm.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
    void saveCustomer(Customer customer);

}
