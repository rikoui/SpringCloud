package pers.rikoui.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {
	
	@RequestMapping("/sayWord")
	public String sayWord() {
		return "i'm eureka client, port is 8762";
	}
	
	@RequestMapping("/actuator/info")
	public String getInfo() {
		return "eureka client 8762 info is ...";
	}
	
}
