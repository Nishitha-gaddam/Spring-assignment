package com.example.springAssignment.myrestaurant.Service;

import com.example.springAssignment.myrestaurant.entity.Orders;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public interface WaiterService {
    public List<Orders> findAll();

  public List<String> findOrders();
}
