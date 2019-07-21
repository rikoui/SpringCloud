package com.rikou.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eurekaclient")
public interface FeignInterface {
	
	@RequestMapping("/sayWord")
	String sayWord();

}
