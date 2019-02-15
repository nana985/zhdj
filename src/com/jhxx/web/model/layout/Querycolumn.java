package com.jhxx.web.model.layout;

import java.io.Serializable;

public class Querycolumn implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1553467369836696042L;
	//表格字段名称id
    private Integer querycolumnid;
    //表头字段属性
    private String prop;
    //表头字段名称
    private String tablename;
    //表头主表id
    private Integer queryid;
    //状态（0初始  1有效  2无效）
    private Short status;
    //排序
    private Integer rorder;
    //标签页序号
    private Integer targetName;

    public Integer getTargetName() {
		return targetName;
	}

	public void setTargetName(Integer targetName) {
		this.targetName = targetName;
	}

	public Integer getQuerycolumnid() {
		return querycolumnid;
	}

	public void setQuerycolumnid(Integer querycolumnid) {
		this.querycolumnid = querycolumnid;
	}

	public void setQueryid(Integer queryid) {
		this.queryid = queryid;
	}

	public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop == null ? null : prop.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    

    public Integer getQueryid() {
		return queryid;
	}

	public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getRorder() {
        return rorder;
    }

    public void setRorder(Integer rorder) {
        this.rorder = rorder;
    }

	@Override
	public String toString() {
		return "Querycolumn [querycolumnid=" + querycolumnid + ", prop=" + prop + ", tablename=" + tablename
				+ ", queryid=" + queryid + ", status=" + status + ", rorder=" + rorder + ", targetName=" + targetName
				+ "]";
	}
}
