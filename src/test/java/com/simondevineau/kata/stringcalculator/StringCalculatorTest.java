package com.simondevineau.kata.stringcalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class StringCalculatorTest {

	private StringCalculator stringCalculator;

	@Before
	public void setUp() {
		stringCalculator = new BasicStringCalculator();
	}
	@Test
	public void defaultBrandIsCasio() {
		assertEquals("Casio", stringCalculator.getBrand());
	}

}
