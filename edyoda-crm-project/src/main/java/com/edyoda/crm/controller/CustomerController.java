package com.edyoda.crm.controller;

import com.edyoda.crm.dao.CustomerDAO;
import com.edyoda.crm.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping("/list")
    public String listCustomers(Model model){
        List<Customer> customers = customerDAO.getCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }

}
