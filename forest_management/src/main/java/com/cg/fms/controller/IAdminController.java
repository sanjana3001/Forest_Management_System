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

import com.cg.fms.dto.Admin;
import com.cg.fms.exception.NoDataFoundException;
import com.cg.fms.service.IAdminServiceImpl;

@RestController
	@RequestMapping("/admin")
	public class IAdminController {
		@Autowired
		IAdminServiceImpl adminService=new IAdminServiceImpl();
		public IAdminServiceImpl geIAdminService() {
			return adminService;
		}
		
		public void setAdminService(IAdminServiceImpl adminService) {
			this.adminService = adminService;
		}
		
		@GetMapping(value="/all",produces="application/json")
		public ResponseEntity<List<Admin>> getAllAdmin(){
			System.out.println("it worked");
			return new ResponseEntity<List<Admin>>(adminService.getAllAdmins(),HttpStatus.OK);
		}
		@GetMapping(value="/{adminid}",produces="application/json")
		public ResponseEntity<Optional<Admin>> getAdmin(@PathVariable("adminid")int adminid){
			Optional<Admin> a=null; 
			a=adminService.getAdmin(adminid);
			System.out.println(a.toString());
			if(a.isPresent()) {
				return new ResponseEntity<Optional<Admin>>(a,HttpStatus.OK);
			}
			else 
				throw new NoDataFoundException("No Admin data found with given Admin ID: "+ adminid);
	    	
		}
		@PostMapping(consumes="application/json")
		public ResponseEntity<HttpStatus> addAdmin(@RequestBody Admin admin) {
			adminService.addAdmin(admin);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		@PutMapping(consumes="application/json")
		public ResponseEntity<HttpStatus> modifyAdmin(@RequestBody Admin admin) {
			adminService.updateAdmin(admin);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		@DeleteMapping(value="/{adminid}")
		public ResponseEntity<HttpStatus> deleteOrder(@PathVariable("adminid")int adminid){
			Optional<Admin> a=null; 
			a=adminService.getAdmin(adminid);
			System.out.println(a.toString());
			if(a.isPresent()) {
				
				adminService.deleteAdmin(adminid);
				return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			}
			else 
				throw new NoDataFoundException("No Admin data found with given Admin ID: "+ adminid);

		}

	}


