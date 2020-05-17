package com.zhbit.findwork.service;

import java.util.List;

import com.zhbit.findwork.entity.Business;

/**
 * 企业业务接口
 * @author SX
 * @description TODO
 * @date 2020年5月16日
 */
public interface BusinessService {
	
	/**
	 * 新增企业
	 * @param business
	 */
	public int addBusiness(Business business);
	
	/**
	 * 修改企业信息
	 * @param business
	 */
	public int updateBusiness(Business business);
	
	/**
	 * 根据ID查询企业信息
	 * @param id
	 * @return
	 */
	public Business getBusinessByID(int id);
	
	/**
	 * 根据企业名字查询企业信息（查询用）
	 * @param name
	 * @return
	 */
	public List<Business> getBusinessesByName(String name);
	
	/**
	 * 根据ID删除企业
	 * @param id
	 */
	public void deleteBusinessByID(int id);
	
	/**
	 * 根据分页返回某一页的企业信息列表
	 * @param firstResult 要查询的第一条记录
	 * @param maxResults  页面大小
	 * @return
	 */
	public List<Business> getBusinessesByPage(int firstResult, int maxResults);
	
	/**
	 * 获取表中数据条数
	 * @return
	 */
	public int getCount();
}
