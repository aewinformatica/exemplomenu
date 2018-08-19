package com.aewinformatica.exemplomenu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class MenuController {

	@GetMapping()
	public  ModelAndView exibir(){
		
		ModelAndView mv = new ModelAndView("Menu");
		
		return mv;
	}
	
	@GetMapping("/webjar")
	public  ModelAndView exibirewebjar(){
		
		ModelAndView mv = new ModelAndView("MenuWebjar");
		
		return mv;
	}
}
