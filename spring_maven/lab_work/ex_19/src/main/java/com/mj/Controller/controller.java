package com.mj.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mj.model.mymodel;

@Controller

public class controller {
	
	
	
	
	@RequestMapping("/hello")
	public String hellomsg() {
		
		return "index";
	}
	
	
//	@RequestMapping("/login")
//	public String loginmsg(Model model) {
//		model.addAttribute("msg", "kalra login");
//		return "login";
//	}
//	
	
	@RequestMapping("/login")
	public String doLogin(HttpServletRequest request, Model model) {
		String userId=request.getParameter("userId");
		model.addAttribute("msg", " "+userId+" from http servlet request func");
		return "login";
	}
	
	
	
	@RequestMapping(path = "/login")
	public String doLogin(@RequestParam(required=false,name="userId")String user,@RequestParam(required=false,name="pwd")String pass, Model model) {
		model.addAttribute("msg", " "+user+" in request Param _ method");
		System.out.println("pass : "+pass);
		return "login";
	}
	
	
	
	@RequestMapping(path="/model")
	public String Loginwithmodel(@ModelAttribute("model123") mymodel mr, Model model) {
		
		model.addAttribute("model123", new mymodel("already","filled"));
		
		
		System.out.println("in model_1 funtion...id :"+mr.getUserId()+" pass : "+mr.getPwd());

		
		
		return "model";
	}
	

	
	
	@RequestMapping(path="/fortest")
	public String Loginwithmodel2(@ModelAttribute("model123") mymodel mr, Model model) {
		
		
		System.out.println("in model_2 funtion...id :"+mr.getUserId()+" pass : "+mr.getPwd());
		model.addAttribute("msg", mr.getUserId()+" in_ Darth Vader Portal : in _._  model aatribute ");
		System.out.println("pass : "+mr.getPwd());
		return "model2";
	}
	
	

}
