package com.bookstore.service;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.UserPayment;

public interface UserPaymentService extends CrudRepository<UserPayment, Long>{
	UserPayment findById(Long id);
}
