package com.jhxx.web.utils;

/**
 * 作为服务器返回JSON格式的结果对象。
 * @author 娜娜
 *
 */
public class ProjectResult {

	private int status;  // 返回的状态
	private String msg;  // 返回的消息
	private Object data; // 返回的数据
	private Object page; // 返回的分页信息
	private Object data2;

	public Object getPage() {
		return page;
	}

	public void setPage(Object page) {
		this.page = page;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getData2() {
		return data2;
	}

	public void setData2(Object data2) {
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "ProjectResult [status=" + status + ", msg=" + msg + ", data=" + data + ", page=" + page + ", data2="
				+ data2 + "]";
	}

	public ProjectResult(int status, String msg, Object data, Object page, Object data2) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
		this.page = page;
		this.data2 = data2;
	}

	public ProjectResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
