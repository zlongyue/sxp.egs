package com.ccqtgb.sxp.egs.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EgsController {

	
	@RequestMapping("/{name}")
	public String hello(@PathVariable("name") String name){
		
		return "Hello "+name;
	}
	
}
