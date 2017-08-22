package com.bookstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.UserPayment;
import com.bookstore.repository.UserPaymentRepository;
import com.bookstore.service.UserPaymentService;

@Service
public class UserPaymentImpl implements UserPaymentService{
	
	@Autowired
	UserPaymentRepository userPaymentRepository;

	@Override
	public UserPayment findById(Long id) {
		return userPaymentRepository.findOne(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserPayment arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends UserPayment> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UserPayment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UserPayment> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserPayment findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserPayment> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UserPayment> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
