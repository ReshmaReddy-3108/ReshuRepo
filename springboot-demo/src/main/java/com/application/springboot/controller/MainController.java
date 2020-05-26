package com.application.springboot.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.application.springboot.model.User1;
import com.application.springboot.service.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainService;

	@RequestMapping("/")
	public String getIndex() {
		
		return "index";
	}
	@RequestMapping("/add")
	public String add(@ModelAttribute("use")User1 user1){
		mainService.add(user1);
		return "add";
		
	}

	/*@RequestMapping("/getData")
	public String getData(@ModelAttribute("use")User1 user1,Model model) {
		//mainService.getData();
		ArrayList<User1> us =mainService.getData(user1);
		model.addAttribute("al",us);
		return "sample";
	}*/

}