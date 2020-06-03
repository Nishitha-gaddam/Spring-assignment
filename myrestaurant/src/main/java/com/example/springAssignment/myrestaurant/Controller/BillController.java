package com.example.springAssignment.myrestaurant.Controller;

import com.example.springAssignment.myrestaurant.Repository.BillRepository;
import com.example.springAssignment.myrestaurant.Service.BillService;
import com.example.springAssignment.myrestaurant.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bills")
public class BillController {

    private BillService billService;

    @Autowired
    public BillController(BillService theBillService){
    	billService=theBillService;
    }
     @GetMapping("/findBills")
    public List<Bills> findAll(){
        return billService.findAll();
     }


    @GetMapping("/findBills/{customerId}")
    public Optional<Bills> findById(@PathVariable int customerId){
        return billService.getBillByCustomerId(customerId);
    }
}
