package com.zcyp.erpSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zcyp.erpSystem.dao.UserDao;
import com.zcyp.erpSystem.model.User;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping
	public ModelAndView index() {
		List<User> users = userDao.findAll();
		return new ModelAndView("index","users",users);
	}
	
	@RequestMapping("/login")
	public String longin(){
		return "login";
	}
}
