package com.example.springAssignment.myrestaurant.Service;

import java.sql.Date;
import java.util.List;

import com.example.springAssignment.myrestaurant.Repository.OwnerRepository;
import com.example.springAssignment.myrestaurant.entity.Bills;

public class OwnerServiceImplementation implements OwnerService {
	private OwnerRepository ownerRepository;

	public OwnerServiceImplementation(OwnerRepository theOwnerRepository) {
		ownerRepository = theOwnerRepository;
	}

	@Override
	public List<Bills> findAlllBills() {
		return ownerRepository.findAll();
	}

	@Override
	public List<Bills> generateBill(Date fromdate, Date toDate) {
		return ownerRepository.generateBill(fromdate, toDate);
	}

	@Override
	public List<Bills> getBillsByDay(Date date) {
		return ownerRepository.getBillsByDay(date);
	}

}
