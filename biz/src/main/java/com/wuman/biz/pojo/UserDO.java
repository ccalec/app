package com.wuman.biz.pojo;

public class UserDO extends BaseDO{
	@Override
	public String toString() {
		return "UserDO [nick=" + nick + ", userActive=" + userActive + ", birthDay=" + birthDay + ", sex=" + sex + ", phone=" + phone + ", pic=" + pic + ", userTag=" + userTag + ", passWord="
				+ passWord + ", dataOwner=" + dataOwner + ", email=" + email + ", address=" + address + ", operTime=" + operTime + ", fullName=" + fullName + ", refUserId="
				+ refUserId + "]";
	}

	private String nick;
	private Integer userActive;
	private Long birthDay;
	private Integer sex;
	private String phone;
	private String pic;
	private Integer userTag;
	private String passWord;
	private String dataOwner;
	private String email;
	private String address;
	private Long operTime;
	private String fullName;
	private Integer refUserId;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Integer getUserActive() {
		return userActive;
	}

	public void setUserActive(Integer userActive) {
		this.userActive = userActive;
	}

	public Long getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Long birthDay) {
		this.birthDay = birthDay;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getUserTag() {
		return userTag;
	}

	public void setUserTag(Integer userTag) {
		this.userTag = userTag;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getDataOwner() {
		return dataOwner;
	}

	public void setDataOwner(String dataOwner) {
		this.dataOwner = dataOwner;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getOperTime() {
		return operTime;
	}

	public void setOperTime(Long operTime) {
		this.operTime = operTime;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getRefUserId() {
		return refUserId;
	}

	public void setRefUserId(Integer refUserId) {
		this.refUserId = refUserId;
	}
}
