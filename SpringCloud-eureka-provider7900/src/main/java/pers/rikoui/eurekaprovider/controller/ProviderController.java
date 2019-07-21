package pers.rikoui.eurekaprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

	@RequestMapping("/sayWord")
	public String sayWord() {
		return "i'm euraka provider 7900";
	}

}
