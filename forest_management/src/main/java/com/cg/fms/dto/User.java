package com.cg.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name="users")
	public class User {
		@Id
		@Column(name="user_name")
		private String userName;
		@Column(name="password")
		private String password;
		@Column(name="role")
		private String role;
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(String userName, String password, String role) {
			super();
			this.userName = userName;
			this.password = password;
			this.role = role;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		
		
	}

