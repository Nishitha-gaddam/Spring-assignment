package com.example.springAssignment.myrestaurant.Repository;

import com.example.springAssignment.myrestaurant.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
