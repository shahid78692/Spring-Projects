package com.spring.ss.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/v1")
@RestController
public class AppController {

	@RequestMapping(value = "/check", method = { RequestMethod.GET }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public String test() {
		return "Service is working fine";

	}
}
