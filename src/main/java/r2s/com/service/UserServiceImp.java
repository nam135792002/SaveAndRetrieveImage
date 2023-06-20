package r2s.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import r2s.com.models.User;
import r2s.com.reponsitory.UserReponsitory;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	UserReponsitory userReponsitory;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return userReponsitory.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userReponsitory.findAll();
	}
}
