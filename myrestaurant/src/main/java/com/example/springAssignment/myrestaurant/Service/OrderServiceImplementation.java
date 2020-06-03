package com.example.springAssignment.myrestaurant.Service;

import java.util.List;
import java.util.Optional;

import com.example.springAssignment.myrestaurant.Repository.OrdersRepository;
import com.example.springAssignment.myrestaurant.entity.Orders;

public class OrderServiceImplementation implements OrderService {
	private OrdersRepository ordersRepository;

	public OrderServiceImplementation(OrdersRepository theOrdersRepository) {
		ordersRepository = theOrdersRepository;
	}

	@Override
	public List<Orders> findAll() {
		return ordersRepository.findAll();
	}

	@Override
	public Optional<Orders> findById(int id) {
		return ordersRepository.findById(id);
	}

	@Override
	public void save(Orders orders) {
		ordersRepository.save(orders);

	}

	@Override
	public void deleteById(int id) {
		ordersRepository.deleteById(id);

	}

}
