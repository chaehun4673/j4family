package com.j4family.service;

import java.util.List;
import java.util.Map;

import com.j4family.vo.UserVO;

public interface UserService {

	List<UserVO> userList(UserVO userVO) throws Exception;

	int userInsert(UserVO user) throws Exception;

	Map<String, Object> detailUser(UserVO userVO) throws Exception;

}
