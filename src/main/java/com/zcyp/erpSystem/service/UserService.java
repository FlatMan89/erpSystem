package com.zcyp.erpSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zcyp.erpSystem.dao.UserDao;
import com.zcyp.erpSystem.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao userdao;
	
	public User getUser(String name){
		return userdao.findByName(name);
	}
	
	public User getUser(Long id){
		return userdao.findById(id);
	}
	
	public List<User> getAll(){
		return userdao.findAll();
	}
	
	public User saveUser(User user){
		return userdao.save(user);
	}
}
