package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.User;

public interface ILoginDao extends JpaRepository<User,String>{

}
