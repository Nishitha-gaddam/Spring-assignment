package com.example.springAssignment.myrestaurant.Controller;

import com.example.springAssignment.myrestaurant.Service.WaiterService;
import com.example.springAssignment.myrestaurant.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class WaiterController {

    private WaiterService waiterService;

    @Autowired
    public WaiterController(WaiterService theWaiterService) {
        waiterService = theWaiterService;
    }

    @GetMapping("/order")
    public List<Orders> findAll() {
        return waiterService.FindAll();
    }

    @GetMapping("/orders")
    public List<String> findAllOrders(){
        return waiterService.findOrders();
    }
}
