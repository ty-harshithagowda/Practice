package com.te.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public ModelAndView myMethod() {
		ModelAndView m = new ModelAndView();
		m.addObject("name", "bharath");
		m.setViewName("/WEB-INF/views/bharath.jsp");
		return m;

	}

	@RequestMapping("/harsh")
	public ModelAndView getharsh() {
		ModelAndView andView = new ModelAndView();
		andView.addObject("name", "harshitha");
		andView.setViewName("bharath");
		return andView;
	}

	@GetMapping("/bharath")
	public String getbharath(ModelMap m) {
		m.addAttribute("name", "Deepthi");
		return "bharath";
	}

	@GetMapping("/login")
	public String getLogin() {
		return "hemadri";
	}

	@PostMapping("/login")
	public String getForm(HttpServletRequest request) {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		request.setAttribute("firstname", firstname);
		request.setAttribute("lastname", lastname);
		return "form";
	}
}
