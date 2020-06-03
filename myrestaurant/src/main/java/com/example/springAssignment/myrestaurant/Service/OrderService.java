package com.example.springAssignment.myrestaurant.Service;

import java.util.List;
import java.util.Optional;

import com.example.springAssignment.myrestaurant.entity.Orders;

public interface OrderService {
	public List<Orders> findAll(); 
    public Optional<Orders> findById(int id);
    public void save(Orders orders);
    public void deleteById(int id);

}
