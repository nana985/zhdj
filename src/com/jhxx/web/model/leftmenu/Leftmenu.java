package com.jhxx.web.model.leftmenu;

import java.io.Serializable;
import java.util.List;


/**
 * 左侧菜单实体类
 * @author 10056
 *
 */
public class Leftmenu implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer soptid;//二级菜单id
	private String boptname;//一级菜单名称
	private String soptname;//二级菜单名称
	private Integer boptid;//一级菜单id
	private String bopturl;
	private String sopturl;
	private List<Leftmenu> smloptList;
	public Integer getSoptid() {
		return soptid;
	}
	public void setSoptid(Integer soptid) {
		this.soptid = soptid;
	}
	public String getBoptname() {
		return boptname;
	}
	public void setBoptname(String boptname) {
		this.boptname = boptname;
	}
	public String getSoptname() {
		return soptname;
	}
	public void setSoptname(String soptname) {
		this.soptname = soptname;
	}
	public Integer getBoptid() {
		return boptid;
	}
	public void setBoptid(Integer boptid) {
		this.boptid = boptid;
	}
	public String getBopturl() {
		return bopturl;
	}
	public void setBopturl(String bopturl) {
		this.bopturl = bopturl;
	}
	public String getSopturl() {
		return sopturl;
	}
	public void setSopturl(String sopturl) {
		this.sopturl = sopturl;
	}
	public List<Leftmenu> getSmloptList() {
		return smloptList;
	}
	public void setSmloptList(List<Leftmenu> smloptList) {
		this.smloptList = smloptList;
	}
	@Override
	public String toString() {
		return "Leftmenu [soptid=" + soptid + ", boptname=" + boptname + ", soptname=" + soptname + ", boptid=" + boptid
				+ ", bopturl=" + bopturl + ", sopturl=" + sopturl + ", smloptList=" + smloptList + "]";
	}
	
	
}
