package com.zcyp.erpSystem.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.zcyp.erpSystem.model.Role;

@Transactional
public interface RoleDao extends PagingAndSortingRepository<Role,Long>{
}
