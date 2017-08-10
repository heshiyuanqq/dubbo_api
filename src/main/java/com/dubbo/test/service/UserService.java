package com.dubbo.test.service;

import java.util.List;

import com.dubbo.test.pojo.User;

public interface UserService {
	public User getUserById(String id);
	public List<User> getUserListByAge(Integer age);
	public List<User> getUserListByAddress(String address);
	public List<User> getUserListByGender(Integer gender);
	public List<User> getUserListByHobby(String hobby);
	public List<User> getUserListByHobbys(String[] hobby);
	
	public String getString();
	public int getint();
	public Integer getInteger();
	public float getfloat();
	public Float getFloat();
	public boolean getboolean();
	public Boolean getBoolean();

}
