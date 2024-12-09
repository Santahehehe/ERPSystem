package com.dowell.ERPSystem.OrderSystem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dowell.ERPSystem.OrderSystem.Object.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
	
}
