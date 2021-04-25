package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import com.cg.fms.dto.Scheduler;

public interface SchedulerService {
	public Optional<Scheduler> getScheduler(String schedulerId);

	public boolean addScheduler(Scheduler scheduler);

	public boolean updateScheduler(Scheduler scheduler);

	public boolean deleteScheduler(String schedulerId);

	public List<Scheduler> getAllSchedulers();
}
