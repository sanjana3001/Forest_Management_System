package com.cg.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	//public class Admin extends User{
	public class Admin{	
		@Id
		@Column(name="admin_id")
		private int adminId;
		@Column(name="admin_name")
		private String adminName;
		@Column(name="admin_password")
		private String adminPassword;
		public Admin() {}
		public Admin(int adminId, String adminName, String adminPassword) {
			//super(adminName,adminPassword,"admin");
			this.adminId = adminId;
			this.adminName = adminName;
			this.adminPassword = adminPassword;
		}
		public int getAdminId() {
			return adminId;
		}
		public void setAdminId(int adminId) {
			this.adminId = adminId;
		}
		public String getAdminName() {
			return adminName;
		}
		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}
		public String getAdminPassword() {
			return adminPassword;
		}
		public void setAdminPassword(String adminPassword) {
			this.adminPassword = adminPassword;
		}
		@Override
		public String toString() {
			return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
		}
		

	}

