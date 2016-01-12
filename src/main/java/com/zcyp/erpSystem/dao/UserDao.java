package com.zcyp.erpSystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.zcyp.erpSystem.entity.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {
	public User findByName(String name);
}
