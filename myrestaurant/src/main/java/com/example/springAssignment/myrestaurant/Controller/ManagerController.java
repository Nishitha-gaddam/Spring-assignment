package com.example.springAssignment.myrestaurant.Controller;

import com.example.springAssignment.myrestaurant.Repository.ManagerRepository;
import com.example.springAssignment.myrestaurant.Service.ManagerService;
import com.example.springAssignment.myrestaurant.entity.Bills;
import com.example.springAssignment.myrestaurant.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/managers")
public class ManagerController {
    private ManagerService managerService;
    @Autowired
    public ManagerController(ManagerService theManagerService){
    	managerService=theManagerService;
    }

    @GetMapping("/gillBills")
    public List<Orders> getAllBills(){
        return managerService.findAllBills();
    }

    @GetMapping("/gillBills/{customerId}")
    public int getBills(@PathVariable int customerId){
        return managerService.generateBillofCustomer(customerId);
    }


}
