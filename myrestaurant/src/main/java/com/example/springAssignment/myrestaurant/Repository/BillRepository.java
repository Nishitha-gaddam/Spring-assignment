package com.example.springAssignment.myrestaurant.Repository;

import com.example.springAssignment.myrestaurant.entity.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface BillRepository  extends JpaRepository<Bills,Integer> {






}
