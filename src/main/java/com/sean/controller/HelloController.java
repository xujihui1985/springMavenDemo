package com.sean.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sean.model.Activity;

@Controller
public class HelloController {

	@RequestMapping(value="/greeting")
	public String sayHello(Model model){
		
		model.addAttribute("greeting", "hello world");
		return "hello";
	}
	
	
	@RequestMapping(value="/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivties() {
		List<Activity> results = new ArrayList<Activity>();
		results.add(new Activity("awesome", "success"));
		results.add(new Activity("awesome2", "failed"));
		return results;
	}
}
