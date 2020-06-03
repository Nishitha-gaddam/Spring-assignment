package com.example.springAssignment.myrestaurant.Service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example.springAssignment.myrestaurant.entity.Orders;

public interface ManagerService {
	public int generateBillofCustomer(@Param("customerId") int id);

	public List<Orders> findAllBills();

}
