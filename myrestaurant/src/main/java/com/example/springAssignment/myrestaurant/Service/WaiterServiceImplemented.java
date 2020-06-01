package com.example.springAssignment.myrestaurant.Service;

import com.example.springAssignment.myrestaurant.Repository.WaiterRepository;
import com.example.springAssignment.myrestaurant.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
@Service
public class WaiterServiceImplemented implements WaiterService{

    private WaiterRepository waiterRepo;
    @Autowired
    public WaiterServiceImplemented(WaiterRepository theWaiterRepo) {
        waiterRepo = theWaiterRepo;
    }

    @Override
    public List<String> findOrders() {
        return waiterRepo.findOrders();
    }

    @Override
    public List<Orders> findAll() {
        return waiterRepo.findAll();
    }
}
