package com.example.springAssignment.myrestaurant.Controller;

import com.example.springAssignment.myrestaurant.Repository.ManagerRepository;
import com.example.springAssignment.myrestaurant.entity.Bills;
import com.example.springAssignment.myrestaurant.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api5")
public class ManagerController {
    private ManagerRepository managerRepository;
    @Autowired
    public ManagerController(ManagerRepository theManagerRepository){
        managerRepository=theManagerRepository;
    }

    @GetMapping("/bill")
    public List<Orders> getAllBills(){
        return managerRepository.findAll();
    }

    @GetMapping("/bill/{customerId}")
    public int getBills(@PathVariable int customerId){
        return managerRepository.generateBillofCustomer(customerId);
    }


}
