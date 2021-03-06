package com.j4family.web.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.j4family.service.UserService;
import com.j4family.vo.UserVO;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String login() {
		return "login/login";
	}
	
	@RequestMapping("/form")
	public String createView() {
		return "user/form";
	}
	
	@PostMapping("/create")
	public String create(UserVO user) throws Exception {
		int cnt = 0;
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		System.out.println(user.getPassword());
		cnt = userService.userInsert(user);
		
		return "redirect:/users/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model, UserVO userVO) throws Exception {
		List<UserVO> users = userService.userList(userVO);
		
		model.addAttribute("users", users);
		return "user/list";
	}
	
	@GetMapping("/{userId}/view")
	public String updateView(@PathVariable String userId, Model model, UserVO userVO) throws Exception {
		
		userVO.setUserId(userId);
		Map<String, Object> map = new HashMap<>();
		map  = userService.detailUser(userVO);
		
		model.addAttribute("user", map);
		return "user/updateView";
	}

}
