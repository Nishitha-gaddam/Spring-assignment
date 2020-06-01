package com.example.springAssignment.myrestaurant.Repository;

import com.example.springAssignment.myrestaurant.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository  extends JpaRepository<Orders,Integer> {

}
