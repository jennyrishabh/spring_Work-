package com.mj.project1;
public class A {
	
	
	int no;
	private B b;

	public A() {
		System.out.println("in constructor A");
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		System.out.println("setting in value by ref : ");
		this.b = b;
	}
	
	
	
	public int  getno() {
		return no;
	}
	public void setno(int b) {
		no=b;
		System.out.println("setting by value : "+no);
		
	}
	
	

}
