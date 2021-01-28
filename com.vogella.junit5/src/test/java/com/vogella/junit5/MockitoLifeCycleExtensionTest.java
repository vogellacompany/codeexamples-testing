package com.vogella.junit5;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) // <.>
@ExtendWith(ExtensionVogellaLifeCycle.class)
class MockitoLifeCycleExtensionTest {


	@Test
	public void test1() {
		assertTrue(true);
	}

	
	@Test
	public void test2() {
		assertTrue(true);
	}
	
	@Test
	public void test3() {
		assertTrue(true);
	}


}
