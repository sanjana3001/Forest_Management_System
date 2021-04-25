package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.ISchedulerDao;
import com.cg.fms.dto.Scheduler;

@Service
	public class SchedulerServiceImpl implements SchedulerService {
		@Autowired
		ISchedulerDao sdao;
		@Override
		public Optional<Scheduler> getScheduler(String schedulerId) {
			// TODO Auto-generated method stub
			return sdao.findById(schedulerId);
		}

		@Override
		public boolean addScheduler(Scheduler scheduler) {
			if(sdao.save(scheduler) != null)
				return true;
			return false;
		}

		@Override
		public boolean updateScheduler(Scheduler scheduler) {
			if(sdao.save(scheduler) != null)
				return true;
			return false;
		}

		@Override
		public boolean deleteScheduler(String schedulerId) {
			sdao.deleteById(schedulerId);
			return false;
		}

		@Override
		public List<Scheduler> getAllSchedulers() {
			// TODO Auto-generated method stub
			return sdao.findAll();
		}

	}

