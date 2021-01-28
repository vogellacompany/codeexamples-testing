package com.vogella.junit5;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.junit.jupiter.api.Test;


class MockitoThrowsTest {
	
	@Test
	public void testForIOException() throws IOException {
		// create an configure mock
		OutputStream mockStream = mock(OutputStream.class);
		doThrow(new IOException()).when(mockStream).close();

		// use mock
		OutputStreamWriter streamWriter = new OutputStreamWriter(mockStream);

		assertThrows(IOException.class, () -> streamWriter.close());
	}


}
