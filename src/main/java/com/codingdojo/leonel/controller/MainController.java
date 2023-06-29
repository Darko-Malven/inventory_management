package com.codingdojo.leonel.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.leonel.service.AppServices;

@Controller
public class MainController {
	@Autowired
	AppServices service;
	
	@GetMapping("/main")
	public String mainPage(HttpSession session) {
		session.getAttribute("userInSession");
		return "main.jsp";
	}
}
