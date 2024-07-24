package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {
	@RequestMapping("/")
	public String form1(Model model) {    		
		model.addAttribute("genders", List.of("Male", "Female", "Other"));
		return "form1";
	}
	@RequestMapping("/success")
	public String success(Model model ,HttpServletRequest req) {
		String Fname= req.getParameter("firstName");
		model.addAttribute("fname",Fname);
		String lname= req.getParameter("lastName");
		model.addAttribute("lname",lname);
		String ss= req.getParameter("sourceStation");
		model.addAttribute("ss",ss);
		String ds= req.getParameter("destStation");
		model.addAttribute("ds",ds);
		String gender= req.getParameter("gender");
		model.addAttribute("gender",gender);
		return "success";
	}
}
