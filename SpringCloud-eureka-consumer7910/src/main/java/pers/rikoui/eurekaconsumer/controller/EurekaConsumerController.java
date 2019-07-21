package pers.rikoui.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaConsumerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("hello")
	public String hello() {
		String url = "http://provider9700/hello";
		return restTemplate.getForObject(url, String.class);
	}
	
	@RequestMapping("/sayWord")
	public String sayWord() {
		return "i'm eureka consumer 7910";
	}

}
