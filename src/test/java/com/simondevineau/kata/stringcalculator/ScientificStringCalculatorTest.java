package com.simondevineau.kata.stringcalculator;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScientificStringCalculatorTest {

	private ScientificStringCalculator scientifiStringCalculator;

	@Before
	public void setUp() {
		scientifiStringCalculator = new ScientificStringCalculator();
	}

	@After
	public void tearDown() {
		scientifiStringCalculator = null;
	}

	// Date with no input returns current date
	// format of addition date-yyyy-mm-dd

	@Test
	public void should_return_min_date_when_no_input() {
		assertEquals(LocalDate.MIN, scientifiStringCalculator.sumDate("",""));
	}

	@Test
	public void should_return_itself_when_single_input() {
		assertEquals(LocalDate.parse("2017-10-23"), scientifiStringCalculator.sumDate("2017-10-23",""));
		assertEquals(LocalDate.parse("2017-10-24"), scientifiStringCalculator.sumDate("2017-10-24",""));
	}
	
	@Test
	public void should_return_sum_two_dates_separated_by_coma(){
		assertEquals(LocalDate.parse("2018-10-23"), scientifiStringCalculator.sumDate("2017-10-23","365"));
		assertEquals(LocalDate.parse("2019-10-23"), scientifiStringCalculator.sumDate("2018-10-23","365"));

	}

}
