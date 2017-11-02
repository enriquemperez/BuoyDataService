package com.cloudsultant.buoy.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPingDto {

	@Test
	public void testDefault()
	{
		// ----------------------------------------------------------------------------------------------
		// Test Default Constructor
		// ----------------------------------------------------------------------------------------------
		PingDto dto1 = new PingDto();

		assertNull(dto1.getMessage());
		assertNotNull(dto1.toString());
		
		// ----------------------------------------------------------------------------------------------
		// Test Parameter Constructor
		// ----------------------------------------------------------------------------------------------
		PingDto dto2 = new PingDto("This is a story about Johny Rotten");

		assertNotNull(dto2.getMessage());
		assertNotNull(dto2.toString());
		assertEquals("This is a story about Johny Rotten", dto2.getMessage());


		// ----------------------------------------------------------------------------------------------
		// Test Getters/Setters
		// ----------------------------------------------------------------------------------------------
		PingDto dto = new PingDto();
		dto.setMessage("Hey Hey My My Rock and Roll will never die");

		assertNotNull(dto.getMessage());
		assertEquals("Hey Hey My My Rock and Roll will never die", dto.getMessage());
		assertNotNull(dto.toString());
	}
}
