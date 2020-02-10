package com.douzone.bookshop.vo;

public class MemberVo {
	private Long no;
	private String name;
	private String email;
	private String password;
	private String phoneNumber;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "고객 [이름=" + name + ", 전화번호" + phoneNumber +  "이메일=" + email + ", 비밀번호=" + password
				+ "]";
	}

}
