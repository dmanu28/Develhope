package com.betalent.libreria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.betalent.libreria.entity.UserEntity;
import com.betalent.libreria.repository.UserRepository;

@Service
public class UserServicImpl {

	private UserRepository userRepo;
	
	public UserServicImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}
	
	public UserEntity salvaUtente(UserEntity user) {
		return userRepo.save(user);
	}
	
	public List<UserEntity> mostraUtenti() {
		return userRepo.findAll();
	}
	
	public boolean isRegistered(UserEntity user) {
		List<UserEntity>registry = userRepo.findAll();
		for(UserEntity u : registry) {
			if(user.getEmail().equals(u.getEmail()) && user.getPassword().equals(u.getPassword()) ) {
				return true;
			}
		}
		return false;
	}
	
	public UserEntity findUser(String email) {
		return userRepo.findUserByEmail(email);
	}
}
