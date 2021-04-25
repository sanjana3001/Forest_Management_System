package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import com.cg.fms.dto.Admin;

public interface IAdminService {
	public Optional<Admin> getAdmin(int adminId);

	public boolean addAdmin(Admin admin);
	
	public boolean updateAdmin(Admin admin);

	public boolean deleteAdmin(int adminId);

	public List<Admin> getAllAdmins();
	
}
