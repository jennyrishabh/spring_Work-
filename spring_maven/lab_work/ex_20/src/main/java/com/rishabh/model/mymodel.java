
package com.rishabh.model;

public class mymodel {
	
	String userId; String pwd;String hobby;String sex;




	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public String getHobby() {
		return hobby;
	}


	public void setHobby(String hobby) {
		this.hobby = hobby;
	}


	public String getUserId() {
		return userId;
	}

	
	public mymodel() {
		
	}

	public mymodel(String userId, String pwd,String hobby,String sex) {
	
		this.userId = userId;
		this.pwd = pwd;
		this.hobby = hobby;
		this.sex = sex;
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

