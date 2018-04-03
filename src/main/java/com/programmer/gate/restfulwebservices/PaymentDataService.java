package com.programmer.gate.restfulwebservices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PaymentDataService {
	private static List<Payment> payments = new ArrayList<>();
	private Integer paymentsCount = 6;
	static {
		payments.add(new Payment(1,1,"book1", 12.3, "gift"));
		payments.add(new Payment(1,2,"book2", 30.0, "gift"));
		payments.add(new Payment(2,3,"apple", 3.0, "grocery"));
		payments.add(new Payment(2,4,"pear", 21.0, "grocery"));
		payments.add(new Payment(2,5,"eggs", 4.0, "grocery"));
		payments.add(new Payment(2,6,"milk", 5.0, "grocery"));
	}
	
	public List<Payment> findAllPaymentsByUserId(int id) {
		List<Payment> list = new ArrayList<>();
		for (Payment payment : payments) {
			if (payment.getUserId() == id) {
				list.add(payment);
			}
		}
		return list;
	}
	
	public Payment savePayment(Payment payment) {
		if (payment.getUserId() == null) return null;
		if (payment.getPaymentId() == null) payment.setPaymentId(++paymentsCount);
		payments.add(payment);
		return payment;
	}
	
	public List<Payment> findPaymentsById(int userId, int paymentId) {
		List<Payment> list = new ArrayList<>();
		for(Payment payment: payments) {
			if (payment.getUserId() == userId && payment.getPaymentId() == paymentId) list.add(payment);
		}
		return list;
	}
	
}
