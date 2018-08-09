package com.pankaj.microservice.orderservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	private OrderRepository repo;
	@PostMapping("/order")
	public void placeOrder(@RequestBody OrderBean order)
	{
		repo.save(order);
	}
	@GetMapping("/orders/{id}")
	public List customerOrders(@PathVariable int id)
	{
		return repo.findAllByCustomerID(id);// what is it returning? orderBean or diff? check
	}
	@DeleteMapping("oder/{id}")
	public void deleteOrder(@PathVariable int id)
	{
		repo.deleteById(id);
	}

}
//cf restart cs restage config,env??