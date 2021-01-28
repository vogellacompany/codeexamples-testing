package com.vogella.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // <.>
@ExtendWith(ExtensionVogellaLifeCycle.class)
class ServiceTest {

	@Mock
	Database databaseMock; // <.>

	@Test
	public void ensureMockitoReturnsTheConfiguredValue() {
		// create mock

		// define return value for method getUniqueId()
		when(databaseMock.getUniqueId()).thenReturn(42);

		Service service = new Service(databaseMock);
		// use mock in test....
		assertEquals(service.toString(), "Using database with id: 42");
	}

}
