package com.mj.model;

public class mymodel {

	
	
	String userId; String pwd;




	public String getUserId() {
		return userId;
	}

	
	public mymodel() {
		
	}

	public mymodel(String userId, String pwd) {
	
		this.userId = userId;
		this.pwd = pwd;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
	
}
