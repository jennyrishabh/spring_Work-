package com.nia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nia.dao.dataClass;
import com.nia.model.signup;

@Controller
public class controller {
	
	@Autowired
	private dataClass obj;
	
//	@ModelAttribute
//	public void starter(Model m) {
//		m.addAttribute("model1",new signup());
//	}
	
	@RequestMapping("/signup")
	public String signup(Model m) {
		m.addAttribute("model1",new signup());
		return "signup";
	}
	
	
	@RequestMapping("/signupProcessing")
	public String signupProcessing(@Valid @ModelAttribute("model1") signup mr , BindingResult results , Model m) {
		
		System.out.println("in signup  funtion...id :"+mr.getEmailid()+" pass1 : "+mr.getPwd1());
		
		System.out.println(mr.toString());
		
		if(results.hasErrors()) {
			System.out.println("has some error");
		return "signup";
	     }
		
		else {
			System.out.println("hasn't some error");
			// insert imto DB : 
			String temp[] = mr.getPwd1().split(",");
			if(obj.insertUser(mr , temp[0]) == 1) {System.out.println("successfully inserted the datat in DB ");}else {System.out.println("failed to inster in DB ");}
			
		m.addAttribute("signup", mr);	
		return "sucess";
		}
		
	}

}
