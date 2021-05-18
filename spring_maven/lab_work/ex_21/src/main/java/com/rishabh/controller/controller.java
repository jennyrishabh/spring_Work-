package com.rishabh.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rishabh.model.mymodel;


@Controller
//@SessionAttributes("model123")

public class controller {
	
	
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	

	
	@RequestMapping(path="/home")
	public String Loginwithmodel(Model model) {
		
		
		model.addAttribute("model123", new mymodel());
		
		return "details";
	}
	

	@RequestMapping(path="/fortest")
	public String Loginwithmodel2(@Valid @ModelAttribute("model123") mymodel mr,BindingResult results) {
		
		
		System.out.println("in model_2 funtion...id :"+mr.getUserId()+" pass : "+mr.getPwd()+" phone no : "+mr.getPhoneno());
		
		
		
		if(results.hasErrors()) {
			System.out.println("has some error");
		return "details";
	     }
		
		else {
			System.out.println("hasn't some error");
			
		return "model3";
		}
		
		
	}
	
	 //from the session management _1 :
	
//
//	@RequestMapping(path="/info")
//	 public String userInfo(@ModelAttribute("model123") mymodel mr) {
//		  System.out.println("\n\n from in the info...controller mapping : ");
//	      System.out.println("Email: " + mr.getUserId());
//	      System.out.println("First Name: " + mr.getPwd());
//	      System.out.println("phone: " + mr.getPhoneno());
//
//	      return "sessionManage1";
//	   }
//	
	
	
	

}


