package com.dowell.ERPSystem.OrderSystem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dowell.ERPSystem.OrderSystem.Object.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Integer>{
	
}
