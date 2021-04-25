package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> {

}
