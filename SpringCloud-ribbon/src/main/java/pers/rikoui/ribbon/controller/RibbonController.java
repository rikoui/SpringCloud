package pers.rikoui.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pers.rikoui.ribbon.service.RibbonService;

@RestController
public class RibbonController {
	
	@Autowired
	private RibbonService ribbonService;
	
	@RequestMapping("/sayWord")
	public String sayWord() {
		return ribbonService.sayWord();
	}

}
