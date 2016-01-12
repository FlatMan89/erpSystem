package com.zcyp.erpSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zcyp.erpSystem.dao.UserDao;
import com.zcyp.erpSystem.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserDao userdao;
	
	@RequestMapping("/{id}")
	public User view(@PathVariable("id") Long id){
		User user = new User();
		user.setId(id);
		user.setName("jin");
		return user;
	}
	
	@RequestMapping("/findByName/{name}")
	public User getUserByName(@PathVariable("name") String name){
		return userdao.findByName(name);
	}
	
	@RequestMapping("/getId/{name}")
	public Long getUserIdByName(@PathVariable("name") String name){
		return userdao.findByName(name).getId();
	}
}
