package com.cloudsultant.buoy.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestBuoyDto {
	
	@Test
	public void testDefault()
	{
		// ----------------------------------------------------------------------------------------------
		// Test Default Constructor
		// ----------------------------------------------------------------------------------------------
		BuoyDto dto1 = new BuoyDto();

		assertNull(dto1.getStationId());
		assertNull(dto1.getWindDirection());
		assertNull(dto1.getWindSpeed());
		assertNull(dto1.getWaveHeight());
		assertNull(dto1.getDominantWavePeriod());
		assertNotNull(dto1.toString());
		
		// ----------------------------------------------------------------------------------------------
		// Test single Parameter Constructor
		// ----------------------------------------------------------------------------------------------
		BuoyDto dto2 = new BuoyDto("12345");

		assertNotNull(dto2.getStationId());
		assertNull(dto2.getWindDirection());
		assertNull(dto2.getWindSpeed());
		assertNull(dto2.getWaveHeight());
		assertNull(dto2.getDominantWavePeriod());
		assertNotNull(dto2.toString());
		assertEquals("12345", dto2.getStationId());

		// ----------------------------------------------------------------------------------------------
		// Test multiple Parameter Constructor
		// ----------------------------------------------------------------------------------------------
		BuoyDto dto3 = new BuoyDto("12345","East","20mph","3.5ft","7sec");

		assertNotNull(dto3.getStationId());
		assertNotNull(dto3.getWindDirection());
		assertNotNull(dto3.getWindSpeed());
		assertNotNull(dto3.getWaveHeight());
		assertNotNull(dto3.getDominantWavePeriod());
		assertNotNull(dto3.toString());
		assertEquals("12345", dto3.getStationId());
		assertEquals("East", dto3.getWindDirection());
		assertEquals("20mph", dto3.getWindSpeed());
		assertEquals("3.5ft", dto3.getWaveHeight());
		assertEquals("7sec", dto3.getDominantWavePeriod());
		
		// ----------------------------------------------------------------------------------------------
		// Test Getters/Setters
		// ----------------------------------------------------------------------------------------------
		BuoyDto dto = new BuoyDto();
		dto.setStationId("98765");
		dto.setWindDirection("North");
		dto.setWindSpeed("10mph");
		dto.setWaveHeight("6ft");
		dto.setDominantWavePeriod("9sec");

		assertNotNull(dto.getStationId());
		assertEquals("98765", dto.getStationId());
		assertEquals("North",dto.getWindDirection());
		assertEquals("10mph",dto.getWindSpeed());
		assertEquals("6ft",dto.getWaveHeight());
		assertEquals("9sec",dto.getDominantWavePeriod());
		assertNotNull(dto.toString());
	}
}
