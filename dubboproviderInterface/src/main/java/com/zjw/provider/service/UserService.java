package com.zjw.provider.service;

import com.zjw.provider.pojo.User;

import java.util.List;

public interface UserService {

	/**
	 * 查询所有的用户数据
	 * 
	 * @return
	 */
	public List<User> queryAll();

}