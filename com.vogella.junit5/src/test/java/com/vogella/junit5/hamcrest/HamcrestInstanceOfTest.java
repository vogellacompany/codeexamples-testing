package com.vogella.junit5.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isA;

import org.junit.jupiter.api.Test;


public class HamcrestInstanceOfTest {

	@Test
	void demosInstanceOfTest() {
		assertThat(Long.valueOf(1), instanceOf(Integer.class));
		// shortcut for instanceOf
		assertThat(Long.valueOf(1), isA(Integer.class));
	}
	
}
