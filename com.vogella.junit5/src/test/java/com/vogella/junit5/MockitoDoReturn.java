package com.vogella.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import java.util.Properties;

import org.junit.jupiter.api.Test;

class MockitoDoReturn {

	// demonstrates of the spy function
	@Test
	public void testMockitoThrows() {
		Properties properties = new Properties();

		Properties spyProperties = spy(properties);

		doReturn("42").when(spyProperties).get("shoeSize");

		String value = (String) spyProperties.get("shoeSize");

		assertEquals("42", value);
	}
}
