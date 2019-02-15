package com.jhxx.web.model.user;
/**
 * 用户表实体类
 * @author 娜娜
 *
 */
public class User {
	private Integer oinsid;//用户ID（别名）
	private Integer userId;//用户id（原）
    private Integer deptid;//部门id
    private String dname;//部门名称
    private String unum;//账号
    private String psd;//密码
    private String uname;//用户姓名
    private String sex;//性别
    private String phone;//电话
    private Integer status;
    private Integer roleid;//角色ID
    private String rolename;//角色名称
    private String remark;
    private Integer unitid;//单位id
    private String unitname;//单位名称
    private Integer returnStatus;//返回值
    private String sign;//操作标记
    private String msg;//返回消息
    
	public Integer getOinsid() {
		return oinsid;
	}
	public void setOinsid(Integer oinsid) {
		this.oinsid = oinsid;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getUnum() {
		return unum;
	}
	public void setUnum(String unum) {
		this.unum = unum;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getRoleid() {
		return roleid;
	}
	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getUnitid() {
		return unitid;
	}
	public void setUnitid(Integer unitid) {
		this.unitid = unitid;
	}
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	public Integer getReturnStatus() {
		return returnStatus;
	}
	public void setReturnStatus(Integer returnStatus) {
		this.returnStatus = returnStatus;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "User [oinsid=" + oinsid + ", userId=" + userId + ", deptid=" + deptid + ", dname=" + dname + ", unum="
				+ unum + ", psd=" + psd + ", uname=" + uname + ", sex=" + sex + ", phone=" + phone + ", status="
				+ status + ", roleid=" + roleid + ", rolename=" + rolename + ", remark=" + remark + ", unitid=" + unitid
				+ ", unitname=" + unitname + ", returnStatus=" + returnStatus + ", sign=" + sign + ", msg=" + msg + "]";
	}
}