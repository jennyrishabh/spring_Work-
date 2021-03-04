package com.ncu.IOC.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("base1")

public class baseball implements Couch {
	
//	@PostConstruct
//	public void domystart() {
//		System.out.println("in start");
//		
//	}
//	
//	@PreDestroy
//	public void domystop() {
//		// TODO Auto-generated method stub
//		
//		System.out.println("in stop");
//	}
	
	
	
	private iFortune ifortune;
	@Value("${name}")
	private String name;
	@Value("${email}")
	private String email; 
	
	
	@Override
	public String toString() {
		return "baseball [name=" + name + ", email=" + email + "]";
	}
	
	

	@Autowired
	public baseball(iFortune ifortune) {
		
		this.ifortune=ifortune;
		
	}
	
	public String getDailyWorkout() {
		return "Hello_from_baseball";
	}

	public String getDailyFortune() {
		return ifortune.getFortune();
	}
	
	
	

}
