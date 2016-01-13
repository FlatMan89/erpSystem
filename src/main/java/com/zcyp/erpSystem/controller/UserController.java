package com.zcyp.erpSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zcyp.erpSystem.dao.UserDao;
import com.zcyp.erpSystem.model.User;
import com.zcyp.erpSystem.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userservice;
	
	@Autowired
	UserDao userdao;
	
	@RequestMapping("/{id}")
	public User view(@PathVariable("id") Long id){
		return userservice.getUser(id);
	}
	
	@RequestMapping("/findByName/{name}")
	public User getUserByName(@PathVariable("name") String name){
		return userservice.getUser(name);
	}
	
	@RequestMapping("/getId/{name}")
	public Long getUserIdByName(@PathVariable("name") String name){
		return userservice.getUser(name).getId();
	}
	
	@RequestMapping("/list")
	public List<User> getAll(){
		return userservice.getAll();
	}
	
	@RequestMapping("/save")
	public User saveUser(User user){
		return userservice.saveUser(user);
	}
	
	@RequestMapping("/get-users-by-name/{name}")
	public List<User> getUsersByName(@PathVariable("name") String name) {
		return userdao.findUsersByName(name);
	}
}
