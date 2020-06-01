package com.example.springAssignment.myrestaurant.Controller;

import com.example.springAssignment.myrestaurant.Repository.CustomerRepository;
import com.example.springAssignment.myrestaurant.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api1")
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository theCustomerRepository){
        customerRepository=theCustomerRepository;
    }

    @GetMapping("/customer")
    public List<Customer> findAll(){
        return customerRepository.findAll();


    }
}
