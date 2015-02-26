package com.capgemini.wsrvc.services.bean.test;

import static org.junit.Assert.assertEquals;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class TestInputTest {

	@Test
	public void testEscapeHtmlCharacter01() throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException,
			IntrospectionException {
		TestInput input = new TestInput();
		input.setId("<aId>");

		input.escapeHtmlCharacter();

		// L'entrée ne contient que des id ou code à comparer. Il ne doivent pas
		// être échappé
		assertEquals("<aId>", input.getId());
	}
}
