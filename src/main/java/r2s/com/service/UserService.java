package r2s.com.service;

import java.util.List;

import r2s.com.models.User;

public interface UserService {
	User save(User user);
	List<User> findAll();
}
