package com.spring.emp.hibernate;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.emp.bean.Emp;

@Controller
public class EmpController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView welcome() {

		return new ModelAndView("index");

	}

	@RequestMapping("/empform")
	public ModelAndView showform() {
		return new ModelAndView("empform", "command", new Emp());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Emp emp) {

		System.out.println(emp.getName() + " " + emp.getSalary() + " " + emp.getDesignation());

		return new ModelAndView("success");
	}

}