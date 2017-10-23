package com.simondevineau.kata.stringcalculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.simondevineau.kata.stringcalculator.BasicStringCalculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class BasicStringCalculatorTest {

	private BasicStringCalculator basicStringCalculator;

	@Before
	public void setUp() {
		basicStringCalculator = new BasicStringCalculator();
	}

	@After
	public void tearDown() {
		basicStringCalculator = null;
	}

	@Test
	public void sumsEmptyStringTo0() {
		assertEquals(0, basicStringCalculator.sum(""));
	}

	@Test
	public void sumsSingleNumberToItself() {
		assertEquals(5, basicStringCalculator.sum("5"));
		assertEquals(42, basicStringCalculator.sum("42"));
	}

	@Test
	public void sumsTwoNumbersSeperatedByComma() {
		assertEquals(3, basicStringCalculator.sum("1,2"));
		assertEquals(4, basicStringCalculator.sum("1,3"));
	}

	@Test
	public void sumsThreeNumbersSeperatedByComma() {
		assertEquals(6, basicStringCalculator.sum("1,2,3"));
	}

	@Test
	public void sumsNumbersDelimitedByNewline() {
		assertEquals(3, basicStringCalculator.sum("1\n2"));
	}

	@Test
	public void sumsNumbersDelimitedByCommaOrNewline() {
		assertEquals(6, basicStringCalculator.sum("1,2\n3"));
	}

	@Test
	public void usesDelimiterSepcified() {
		assertEquals(3, basicStringCalculator.sum("//;\n1;2"));
		assertEquals(6, basicStringCalculator.sum("//.\n2.3.1"));
	}

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void throwsOnNegativeNumber() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("negative number: -3");

		basicStringCalculator.sum("-3");
	}

	@Test
	public void throwsOnNegativeNumbersWithAllNumbersInExceptionMessage() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("negative number: -3,-5,-13");

		basicStringCalculator.sum("1,-3,5,-5,-13");
	}

	@Test
	public void mapsNumbersAbove1000ToLastThreeDigits() {
		assertEquals(2, basicStringCalculator.sum("1002"));
		assertEquals(42, basicStringCalculator.sum("1040,10002"));
	}

	@Test
	public void acceptsDelimiterOfArbitraryLength() {
		assertEquals(6, basicStringCalculator.sum("//[***]\n1***2***3"));
	}

	@Test
	public void acceptsMultipleDelimiters() {
		assertEquals(6, basicStringCalculator.sum("//[-][;]\n1-2;3"));
		assertEquals(9, basicStringCalculator.sum("//[--][...]\n2--3...4"));
	}
}
