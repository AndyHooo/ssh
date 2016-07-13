package com.andy.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Lob;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.andy.dao.UserDao;
import com.andy.model.User;
import com.andy.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	private static final Log log = LogFactory.getLog(UserServiceImpl.class);
	
	@Resource(name="userDao")
	private UserDao dao;
	
	@Override
	public void add(User user) throws Exception {
		dao.add(user);
	}

	@Override
	public void delById(int id) throws Exception {
		dao.delById(id);

	}

	@Override
	public void update(User user) throws Exception {
		dao.update(user);

	}

	@Override
	public User getById(int id) throws Exception {
		return dao.getById(id);
	}

	@Override
	public List<User> getUser() throws Exception {
		return dao.getUser();
	}

}
