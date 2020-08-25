package com.example.demo.dto;

public class Member {
	Integer id;
	String name;
	String email;
	String gender;
	String birth;
	String phoneNumber;
	String passwd;
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", birth=" + birth
				+ ", phoneNumber=" + phoneNumber + ", passwd=" + passwd + "]";
	}
	
	public Member(Integer id, String name, String email, String gender, String birth, String phoneNumber,String passwd) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.birth = birth;
		this.phoneNumber = phoneNumber;
		this.passwd = passwd;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passward) {
		this.passwd = passward;
	}
}

