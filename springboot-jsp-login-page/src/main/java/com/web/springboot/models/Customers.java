package com.web.springboot.models;

public class Customers {

	int cid;
	String cname;
	String cemail;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
	}
}
