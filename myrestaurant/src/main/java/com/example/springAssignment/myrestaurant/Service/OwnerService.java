package com.example.springAssignment.myrestaurant.Service;

import java.sql.Date;
import java.util.List;

import com.example.springAssignment.myrestaurant.entity.Bills;

public interface OwnerService {
	public List<Bills> findAlllBills();
	public List<Bills> generateBill(Date fromdate, Date toDate);
	public List<Bills> getBillsByDay(Date date);

}
