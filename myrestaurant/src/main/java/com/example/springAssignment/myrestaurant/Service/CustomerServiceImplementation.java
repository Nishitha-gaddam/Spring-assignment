package com.example.springAssignment.myrestaurant.Service;

import java.util.List;
import java.util.Optional;

import com.example.springAssignment.myrestaurant.Repository.CustomerRepository;
import com.example.springAssignment.myrestaurant.entity.Customer;

public class CustomerServiceImplementation implements CustomerService {
	
	 private CustomerRepository customerRepository;

	    public CustomerServiceImplementation(CustomerRepository theCustomerRepository){
	        customerRepository=theCustomerRepository;
	    }

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> findById(int id) {
		 Optional<Customer> result = customerRepository.findById(id);
		 Customer customer = null;
	        if(result.isPresent()) {
	        	customer = result.get();
	        }
		return customerRepository.findById(id);
	}

	@Override
	public void save(Customer customer) {
		customerRepository.save(customer);

	}

	@Override
	public void deleteById(int id) {
		customerRepository.deleteById(id);

	}

}
