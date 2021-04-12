package com.rishabh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rishabh.model.mymodel;


@Controller

public class controller {
	
	
	
	@RequestMapping(path="/home")
	public String Loginwithmodel(@ModelAttribute("model123") mymodel mr, Model model) {
		
		model.addAttribute("model123", new mymodel("rishabh","jain","Snowboarding","M"));
		
		
		System.out.println("in model_1 funtion...id :"+mr.getUserId()+" pass : "+mr.getPwd());

		
		
		return "details";
	}
	

	
	
	@RequestMapping(path="/fortest")
	public String Loginwithmodel2(@ModelAttribute("model123") mymodel mr, Model model) {
		
		
		System.out.println("in model_2 funtion...id :"+mr.getUserId()+" pass : "+mr.getPwd());
		String temp=" <br>username:"+mr.getUserId()+"<br> : hobby-"+mr.getHobby()+"<br> : sex-"+mr.getSex()+"<br> : pwd-"+mr.getPwd();
		model.addAttribute("msg",temp );
		System.out.println("pass : "+mr.getPwd());
		return "model2";
	}
	
	

}


