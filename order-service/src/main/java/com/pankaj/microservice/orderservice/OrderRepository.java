package com.pankaj.microservice.orderservice;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<OrderBean,Integer> {

	public abstract List findAllByCustomerID(int id);
}
