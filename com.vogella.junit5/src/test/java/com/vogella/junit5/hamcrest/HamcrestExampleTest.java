package com.vogella.junit5.hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;

import org.junit.jupiter.api.Test;


public class HamcrestExampleTest {

	@Test
	void test() {
		boolean a = true;
		boolean b = true;
		
		assertThat(a, equalTo(b));
		assertThat(a, is(equalTo(b)));
		assertThat(a, is(b));	
		
		
		assertThat(Long.valueOf(1), instanceOf(Integer.class));
		// shortcut for instanceOf
		assertThat(Long.valueOf(1), isA(Integer.class));
	}

	
}
