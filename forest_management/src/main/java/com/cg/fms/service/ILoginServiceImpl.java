package com.cg.fms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.ILoginDao;
import com.cg.fms.dto.User;

@Service
	public class ILoginServiceImpl implements ILoginService{
		@Autowired
		ILoginDao ldao;
		
		@Override
		public Optional<User> login(String username, String password) {
			Optional<User> user=ldao.findById(username);
			if(user.get().getUserName().equals(username)&&user.get().getPassword().equals(password)) {
					return user;
			}
			return null;
		}

		@Override
		public User logout(User user) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public User addUser(User user) {
			ldao.save(user);
			return null;
		}

		@Override
		public User removeUser(User user) {
			ldao.delete(user);
			return null;
		}

	}


