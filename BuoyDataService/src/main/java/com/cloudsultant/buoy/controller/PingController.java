package com.cloudsultant.buoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsultant.buoy.dto.PingDto;

@RestController
public class PingController {

	@RequestMapping(value="/ping", method=RequestMethod.GET)
	public PingDto ping()
	{
		return new PingDto("Successful Ping");
	}
}
