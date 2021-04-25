package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Scheduler;

public interface ISchedulerDao extends JpaRepository<Scheduler,String> {

}
