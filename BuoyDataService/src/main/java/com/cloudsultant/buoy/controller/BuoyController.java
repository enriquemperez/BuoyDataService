package com.cloudsultant.buoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsultant.buoy.dto.BuoyDto;
import com.cloudsultant.buoy.helper.BuoyHtmlParseHelper;

@RestController
public class BuoyController {

	@RequestMapping(value="/buoy", method=RequestMethod.GET)
	public BuoyDto buoy(@RequestParam("stationId") String stationId)
	{
		try
		{
		  BuoyHtmlParseHelper h = new BuoyHtmlParseHelper();
		  BuoyDto dto = h.parse( stationId );
		  return dto;
		}
		catch(Exception e)
		{
		  e.printStackTrace();
		  return null;
		}
	}
}
