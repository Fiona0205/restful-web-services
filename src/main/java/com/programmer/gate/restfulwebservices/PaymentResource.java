package com.programmer.gate.restfulwebservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentResource {
	@Autowired
	private PaymentDataService service;
	
	@GetMapping("/users/{id}/payments")
	public List<Payment> retrievePaymentsByUserId(@PathVariable int id) {
		List<Payment> payments = service.findAllPaymentsByUserId(id);
		if (payments.size() == 0) throw new UserNotFoundException("id-" + id);
		return payments;
	}
}
