package com.example.springAssignment.myrestaurant.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.springAssignment.myrestaurant.Repository.BillRepository;
import com.example.springAssignment.myrestaurant.entity.Bills;

public class BillServiceImplementation implements BillService {

	private BillRepository billRepository;

	@Autowired
	public BillServiceImplementation(BillRepository theBillRepository) {
		billRepository = theBillRepository;
	}

	@Override
	public List<Bills> findAll() {
		return billRepository.findAll();
	}

	@Override
	public Optional<Bills> getBillByCustomerId(@PathVariable int customerId) {
		return billRepository.findById(customerId);
	}

}
