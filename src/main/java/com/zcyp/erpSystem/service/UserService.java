package com.zcyp.erpSystem.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.zcyp.erpSystem.dao.UserDao;
import com.zcyp.erpSystem.model.User;

@Service
public class UserService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class); 
	
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
		if(user==null){
			LOGGER.debug("保存 User 时传入的 user 对象为NULL");
			return null;
		}
		return userdao.save(user);
	}
	
	public Page<User> findAll(int page,int size){
		return userdao.findAll(new PageRequest(page, size));
	}
	
//	public List<User> findByRoleId(Role role){
//		return userdao.findByRole(role);
//	}
	
}
