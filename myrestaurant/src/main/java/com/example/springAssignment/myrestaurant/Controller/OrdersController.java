package com.example.springAssignment.myrestaurant.Controller;

import com.example.springAssignment.myrestaurant.Repository.OrdersRepository;
import com.example.springAssignment.myrestaurant.Service.OrderService;
import com.example.springAssignment.myrestaurant.entity.Bills;
import com.example.springAssignment.myrestaurant.entity.Orders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrdersController {
	private OrderService orderService;

	public OrdersController(OrderService theOrderService) {
		orderService = theOrderService;
	}

	@GetMapping("/getOrders")
	public List<Orders> findAll() {
		return orderService.findAll();
	}

}
