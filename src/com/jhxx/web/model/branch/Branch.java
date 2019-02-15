package com.jhxx.web.model.branch;

import java.io.Serializable;
/**
 * 分支组织实体类
 * @author Administrator
 *
 */
public class Branch implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1668947678316479044L;
	private Integer bran_id;//分支组织id
	private String bran_name;//分支组织名称
	private String bran_intro;//分支组织简介
	private Integer bran_lastid;//上一个id
	private Integer bran_nextid;//下一个id
	private String bran_image;//组织架构图
	private Integer wx_app_id;//企业表id
	private Integer bran_status;//分支组织状态
	public Integer getBran_id() {
		return bran_id;
	}
	public void setBran_id(Integer bran_id) {
		this.bran_id = bran_id;
	}
	public String getBran_name() {
		return bran_name;
	}
	public void setBran_name(String bran_name) {
		this.bran_name = bran_name;
	}
	public String getBran_intro() {
		return bran_intro;
	}
	public void setBran_intro(String bran_intro) {
		this.bran_intro = bran_intro;
	}
	public Integer getBran_lastid() {
		return bran_lastid;
	}
	public void setBran_lastid(Integer bran_lastid) {
		this.bran_lastid = bran_lastid;
	}
	public Integer getBran_nextid() {
		return bran_nextid;
	}
	public void setBran_nextid(Integer bran_nextid) {
		this.bran_nextid = bran_nextid;
	}
	public String getBran_image() {
		return bran_image;
	}
	public void setBran_image(String bran_image) {
		this.bran_image = bran_image;
	}
	public Integer getWx_app_id() {
		return wx_app_id;
	}
	public void setWx_app_id(Integer wx_app_id) {
		this.wx_app_id = wx_app_id;
	}
	public Integer getBran_status() {
		return bran_status;
	}
	public void setBran_status(Integer bran_status) {
		this.bran_status = bran_status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Branch [bran_id=" + bran_id + ", bran_name=" + bran_name + ", bran_intro=" + bran_intro
				+ ", bran_lastid=" + bran_lastid + ", bran_nextid=" + bran_nextid + ", bran_image=" + bran_image
				+ ", wx_app_id=" + wx_app_id + ", bran_status=" + bran_status + "]";
	}
	
	
}	
