package com.wuman.biz.domain;

public class UserQuery {
	private String nick;
	private String phone;
	private Integer userActive;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getUserActive() {
		return userActive;
	}

	public void setUserActive(Integer userActive) {
		this.userActive = userActive;
	}
}
