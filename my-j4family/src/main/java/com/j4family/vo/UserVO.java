package com.j4family.vo;

public class UserVO {
	private String userId;
	private String name;
	private String password;
	private String regDt;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRegDt() {
		return regDt;
	}
	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + ", name=" + name + ", password=" + password + ", regDt=" + regDt + "]";
	}


}
