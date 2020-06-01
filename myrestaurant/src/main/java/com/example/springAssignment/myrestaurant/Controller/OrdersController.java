package com.example.springAssignment.myrestaurant.Controller;

import com.example.springAssignment.myrestaurant.Repository.OrdersRepository;
import com.example.springAssignment.myrestaurant.entity.Bills;
import com.example.springAssignment.myrestaurant.entity.Orders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api2")
public class OrdersController {
    private OrdersRepository ordersRepository;

   public OrdersController(OrdersRepository theOrdersRepository){
        ordersRepository =theOrdersRepository;
    }

    @GetMapping("/orders")
    public List<Orders> findAll(){
        return ordersRepository.findAll();
    }

    @GetMapping("/bill/{customerId}")
    public Optional<Orders> getBill(@PathVariable int customerId){
        return ordersRepository.findById(customerId);
    }

}
