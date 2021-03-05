package com.ncu.IOC.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("tcouch")
public class tenis implements Couch {

	
	private iFortune ifortune;
	
	public tenis() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	
	// notice the setter and getter methods name convention
	
	@Autowired
	public iFortune getIfortune9() {
		return ifortune;
	}

	public void setIfortune9(iFortune ifortune) {
		this.ifortune = ifortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "in_tennis_class";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "good day from tennis class...()";
	}

}
