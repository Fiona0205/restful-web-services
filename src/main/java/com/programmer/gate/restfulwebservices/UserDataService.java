package com.programmer.gate.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
//talk to database
@Component
public class UserDataService {
	private static List<User> users = new ArrayList<>();
	private static int usersCount = 6;
	static {
		users.add(new User(1, "Name1", new Date()));
		users.add(new User(2, "Name2", new Date()));
		users.add(new User(3, "Name3", new Date()));
		users.add(new User(4, "Name4", new Date()));
		users.add(new User(5, "Name5", new Date()));
		users.add(new User(6, "Name6", new Date()));
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User saveUser(User user) {
		if (user.getId() == null) user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	public User findUserById(int id) {
		for(User user: users) {
			if (user.getId() == id) return user;
		}
		return null;
	}
	
	public User deleteUserById(int id) {
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
