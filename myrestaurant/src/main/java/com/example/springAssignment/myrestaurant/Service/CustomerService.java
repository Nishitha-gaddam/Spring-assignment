package com.example.springAssignment.myrestaurant.Service;
import java.util.List;
import java.util.Optional;

import com.example.springAssignment.myrestaurant.entity.*;

public interface CustomerService {
	public List<Customer> findAll(); 
    public Optional<Customer> findById(int id);
    public void save(Customer customer);
    public void deleteById(int id);

}
