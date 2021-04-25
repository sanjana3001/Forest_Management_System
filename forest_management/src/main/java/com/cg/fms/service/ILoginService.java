package com.cg.fms.service;

import java.util.Optional;

import com.cg.fms.dto.User;

public interface ILoginService {
	public Optional<User> login(String username,String password);
	public User logout(User user);
	public User addUser(User user);
	public User removeUser(User user);
}
