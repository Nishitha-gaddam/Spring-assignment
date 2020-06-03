package com.example.springAssignment.myrestaurant.Controller;

import com.example.springAssignment.myrestaurant.Repository.CustomerRepository;
import com.example.springAssignment.myrestaurant.Service.CustomerService;
import com.example.springAssignment.myrestaurant.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService theCustomerService){
    	customerService=theCustomerService;
    }

    @GetMapping("/findAllCustomers")
    public List<Customer> findAll(){
        return customerService.findAll();
    }
    
    
}
