package com.springboot.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/water")
public class WaterController {
	@Autowired
	private WaterRepository waterRepository;
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Welcome";
	}
	@RequestMapping(value="/add" ,method=RequestMethod.POST)
	public void addWater(@RequestBody UseWater usewater)
	{
		waterRepository.save(usewater);
	}
}
