package com.j4family.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.j4family.vo.UserVO;

@Mapper
@Repository
public interface UserDao {

	List<UserVO> userList(UserVO userVO) throws Exception;

	int userInsert(UserVO user) throws Exception;

	Map<String, Object> detailUser(UserVO userVO) throws Exception;

}
