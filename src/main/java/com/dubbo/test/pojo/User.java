package com.dubbo.test.pojo;

import java.io.Serializable;
import java.util.Arrays;

public class User implements Serializable{
	
	private static final long serialVersionUID = 2487375678345637457L;
	private String id;
	private String name;
	private String phone;
	private String email;
	private String address;
	private Integer gender;
	private Integer age;
	private String[] hobbys;
	
	
	public User() {
		super();
	}
	public User(String id, String name, String phone, String email,
			String address, Integer gender, Integer age, String[] hobbys) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.hobbys = hobbys;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String[] getHobbys() {
		return hobbys;
	}
	public void setHobbys(String[] hobbys) {
		this.hobbys = hobbys;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + ", gender="
				+ gender + ", age=" + age + ", hobbys="
				+ Arrays.toString(hobbys) + "]";
	}
	
	
	
	

}
