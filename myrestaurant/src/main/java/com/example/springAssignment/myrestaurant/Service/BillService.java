package com.example.springAssignment.myrestaurant.Service;
import java.util.List;
import java.util.Optional;

import com.example.springAssignment.myrestaurant.entity.*;

public interface BillService {
	public List<Bills>findAll();
	public Optional<Bills> getBillByCustomerId(int customerId);
	
}
