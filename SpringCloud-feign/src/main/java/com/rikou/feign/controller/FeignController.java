package com.rikou.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rikou.feign.service.FeignInterface;

@RestController
public class FeignController {

	@Autowired
	private FeignInterface feignInterface;

	@RequestMapping("/sayWord")
	public String sayWord() {
		return feignInterface.sayWord();
	}
	
	@RequestMapping("/actuator/info")
	public String getInfo() {
		return "feign info is ...";
	}

}
