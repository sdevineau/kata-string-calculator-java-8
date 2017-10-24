package com.simondevineau.kata.stringcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void defaultBrandIsCasio() {
		BasicStringCalculator stringCalculator = new BasicStringCalculator();
		assertEquals("Casio", stringCalculator.getBrand());
	}

}
