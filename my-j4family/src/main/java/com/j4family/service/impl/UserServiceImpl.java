package com.j4family.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.j4family.dao.UserDao;
import com.j4family.service.UserService;
import com.j4family.vo.UserVO;

@Service
public class UserServiceImpl  implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<UserVO> userList(UserVO userVO) throws Exception {
		return userDao.userList(userVO);
	}

	@Override
	public int userInsert(UserVO user) throws Exception {
		return userDao.userInsert(user);
	}

	@Override
	public Map<String, Object> detailUser(UserVO userVO) throws Exception {
		return userDao.detailUser(userVO);
	}

}
