package com.tel.filtering.tool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1.0/sms")
@RestController
public class TelFilteringToolController {

	@GetMapping("/")
	public String index() {
		return "Welcome to Telecom Fitering Tool App";
	}
}
