package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Land;

public interface ILandDao extends JpaRepository<Land,String> {

}
