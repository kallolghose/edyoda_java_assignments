package com.edyoda.crm.controller;

import com.edyoda.crm.entity.Customer;
import com.edyoda.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public String listCustomers(Model model){
        List<Customer> customers = customerService.getCustomers();
        model.addAttribute("customers", customers);
        return "list-customers";
    }


    /**
     * @RequestMapping(method=GET) == @GetMapping()
     * @return
     */
    @GetMapping(value = "/showAddCustomerForm")
    public String showCustomerForm(Model model){
        Customer addCustomer = new Customer();
        model.addAttribute("customer", addCustomer);
        return "add-customer-form";
    }

    //@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
    @PostMapping(value = "/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }


}
