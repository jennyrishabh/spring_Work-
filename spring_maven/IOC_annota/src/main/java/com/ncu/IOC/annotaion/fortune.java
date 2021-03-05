package com.ncu.IOC.annotaion;

import org.springframework.stereotype.Component;
@Component
public class fortune implements iFortune {
	
	public String getFortune() {
		
		return "good_day_from_fortune class..()";
		
	}

}
