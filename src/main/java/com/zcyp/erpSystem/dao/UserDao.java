package com.zcyp.erpSystem.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.zcyp.erpSystem.model.User;

@Transactional
public interface UserDao extends PagingAndSortingRepository<User, Long>{
	/**
	 * 根据姓名查找
	 * @param name
	 * @return
	 */
	public User findByName(String name);
	
	/**
	 * 根据姓名查找多个用户
	 * @return
	 */
	public List<User> findUsersByName(String name);
	
	/**
	 * 根据 ID 查找
	 * @param id
	 * @return
	 */
	public User findById(Long id);
	
	/**
	 * 查找 全部
	 * @return 
	 */
	public List<User> findAll();
	
	/**
	 * 分页查询
	 */
	@Override
	public Page<User> findAll(Pageable pageable);
	
}
