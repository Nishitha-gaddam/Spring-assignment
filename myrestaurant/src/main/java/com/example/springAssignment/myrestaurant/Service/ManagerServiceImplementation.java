package com.example.springAssignment.myrestaurant.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.springAssignment.myrestaurant.Repository.ManagerRepository;
import com.example.springAssignment.myrestaurant.entity.Orders;

public class ManagerServiceImplementation implements ManagerService {
	  private ManagerRepository managerRepository;
	    @Autowired
	    public ManagerServiceImplementation(ManagerRepository theManagerRepository){
	        managerRepository=theManagerRepository;
	    }
		@Override
		public int generateBillofCustomer(int id) {
			return managerRepository.generateBillofCustomer(id);
		}
		@Override
		public List<Orders> findAllBills() {
			return managerRepository.findAll();
		}

}
