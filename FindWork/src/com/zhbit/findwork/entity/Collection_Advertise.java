package com.zhbit.findwork.entity;

import java.util.Date;
/**
 * �ղ����ģ���Ƹ����
 * 
 * @author ������
 *
 */
public class Collection_Advertise {
	private int id;
	private User user; //�û����һ
	private Advertise advertise; //����Ƹ���һ
	private int delete_flag = 0;//ɾ����ʶ   0������  1����ɾ��
	private String comment;		//
	private Date create_at;		//����ʱ��
	private Date update_at;		//����ʱ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Advertise getAdvertise() {
		return advertise;
	}
	public void setAdvertise(Advertise advertise) {
		this.advertise = advertise;
	}
	public int getDelete_flag() {
		return delete_flag;
	}
	public void setDelete_flag(int delete_flag) {
		this.delete_flag = delete_flag;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public Date getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	
	
}