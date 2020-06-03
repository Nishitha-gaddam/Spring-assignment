package com.example.springAssignment.myrestaurant.Repository;

import com.example.springAssignment.myrestaurant.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ManagerRepository extends JpaRepository<Orders, Integer> {
	@Query("select sum(quantity*itemPrice) from Orders where customerId=(:customerId)")
	public int generateBillofCustomer(@Param("customerId") int id);
}
