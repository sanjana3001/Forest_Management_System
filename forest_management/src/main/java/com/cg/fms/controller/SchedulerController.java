package com.cg.fms.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.dto.Scheduler;
import com.cg.fms.exception.NoDataFoundException;
import com.cg.fms.service.SchedulerService;
import com.cg.fms.service.SchedulerServiceImpl;

@RestController
	@RequestMapping("/scheduler")
	public class SchedulerController {
		@Autowired
		private SchedulerService schedulerService;
		
		public SchedulerService getSchedulerDAO() {
			return schedulerService;
		}
		
		public void setSchedulerDAO(SchedulerServiceImpl schedulerService) {
			this.schedulerService = schedulerService;
		}
		
		@GetMapping(value="/all",produces="application/json")
		public  ResponseEntity<List<Scheduler>> getAllScheduler(){
			return new ResponseEntity<List<Scheduler>> (schedulerService.getAllSchedulers(),HttpStatus.OK);
		}
		
		@GetMapping(value="/{schedulerId}",produces="application/json")
		public ResponseEntity<Optional<Scheduler>> getScheduler(@PathVariable("schedulerId")String schedulerId){ 
			Optional<Scheduler> s=schedulerService.getScheduler(schedulerId);
			if(s.isPresent()) {
				return new ResponseEntity<Optional<Scheduler>>(s,HttpStatus.OK);
				}
			else 
				throw new NoDataFoundException("No Scheduler data found with given Scheduler ID: "+ schedulerId);

		}
		
		@PostMapping(consumes="application/json")
		public ResponseEntity<HttpStatus> addnewScheduler(@RequestBody Scheduler scheduler){
			schedulerService.updateScheduler(scheduler);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		
		@PutMapping(consumes="application/json")
		public ResponseEntity<HttpStatus> modifyScheduler(@RequestBody Scheduler scheduler){
			schedulerService.updateScheduler(scheduler);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);	
		}
		
		@DeleteMapping(value="/{schedulerID}")
		public ResponseEntity<HttpStatus> deleteScheduler(@PathVariable("schedulerID")String schedulerId)
		{
			Optional<Scheduler> s=schedulerService.getScheduler(schedulerId);
			if(s.isPresent()) {
				schedulerService.deleteScheduler(schedulerId);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
				}
			else 
				throw new NoDataFoundException("No Scheduler data found with given Scheduler ID: "+ schedulerId);

		}
	}

