package com.jhxx.web.model;
/**
 * 获取第三方应用凭证所需参数
 * @author nana
 *
 */
public class Suite {

	private String suite_id;		//应用id(第三方应用的)
	private String suite_secret;	//应用secret
	private String suite_ticket;	//企业微信后台推送的ticket
	
	public String getSuite_id() {
		return suite_id;
	}
	public void setSuite_id(String suite_id) {
		this.suite_id = suite_id;
	}
	public String getSuite_secret() {
		return suite_secret;
	}
	public void setSuite_secret(String suite_secret) {
		this.suite_secret = suite_secret;
	}
	public String getSuite_ticket() {
		return suite_ticket;
	}
	public void setSuite_ticket(String suite_ticket) {
		this.suite_ticket = suite_ticket;
	}
	@Override
	public String toString() {
		return "Suite [suite_id=" + suite_id + ", suite_secret=" + suite_secret + ", suite_ticket=" + suite_ticket
				+ "]";
	}
}
