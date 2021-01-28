package com.vogella.junit5;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(ExtensionVogellaStringParameterResolver.class)
public class ParameterResolverTest {

	@Test
	void ensureThatCustomJUnit(String parameter) {
		assertNotNull(parameter);
	}
}
