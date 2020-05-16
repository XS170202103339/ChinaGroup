package com.zhbit.findwork.dao;

import java.util.List;
import com.zhbit.findwork.entity.User;

public interface UserDao {
	/**
	 * 根据用户名字查询用户是否存在
	 * @return
	 */
	public boolean isExist(String name);
	/**
	 * 新增用户
	 * @param user
	 */
	public void addUser(User user);
	/**
	 * 修改用户信息
	 * @param user
	 */
	public void updateUser(User user);
	/**
	 * 根据ID查询用户信息
	 * @param id
	 * @return
	 */
	public User getUserByID(int id);
	/**
	 * 根据用户名字查询用户信息（查询用）
	 * @param name
	 * @return
	 */
	public List<User> getUserListByName(String name);
	
	/**
	 * 根据ID删除用户
	 * @param id
	 */
	public void deleteUserByID(int id);
	
	/**
	 * 根据分页返回某一页的用户信息列表
	 * @param firstResult 要查询的第一条记录
	 * @param maxResults  页面大小
	 * @return
	 */
	public List<User> getUserByPage(int firstResult, int maxResults);
	
	/**
	 * 获取表中数据条数
	 * @return
	 */
	public int getCount();


}
