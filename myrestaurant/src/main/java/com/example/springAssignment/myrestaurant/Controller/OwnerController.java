package com.example.springAssignment.myrestaurant.Controller;

import com.example.springAssignment.myrestaurant.Repository.OwnerRepository;
import com.example.springAssignment.myrestaurant.Service.OwnerService;
import com.example.springAssignment.myrestaurant.entity.Bills;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {
	private OwnerService ownerService;

	public OwnerController(OwnerService theOwnerService) {
		ownerService = theOwnerService;
	}

	@GetMapping("/getbills")
	public List<Bills> getAlllBills() {
		return ownerService.findAlllBills();
	}

	@GetMapping("/getbills/{fromDate}/{toDate}")
	public List<Bills> getBills(@PathVariable Date fromDate, @PathVariable Date toDate) {
		return ownerService.generateBill(fromDate, toDate);
	}

	@GetMapping("/getbills/{date}")
	public List<Bills> getBillsByDay(@PathVariable Date date) {
		return ownerService.getBillsByDay(date);

	}
}
