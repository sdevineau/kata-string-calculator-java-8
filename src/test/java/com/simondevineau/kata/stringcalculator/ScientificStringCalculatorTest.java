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
	public void sum_date_when_single_numDays_input(){
		assertEquals(LocalDate.parse("2018-10-23"), scientifiStringCalculator.sumDate("2017-10-23","365"));
		assertEquals(LocalDate.parse("2019-10-23"), scientifiStringCalculator.sumDate("2018-10-23","365"));

	}
	
	@Test
	public void sum_date_when_two_numDays_input(){
		assertEquals(LocalDate.parse("2018-11-02"), scientifiStringCalculator.sumDate("2017-10-23","365,10"));
		assertEquals(LocalDate.parse("2019-11-22"), scientifiStringCalculator.sumDate("2018-10-23","365,30"));
	}

	
	@Test
	public void sum_date_whith_single_period(){
		assertEquals(LocalDate.parse("2018-10-23"), scientifiStringCalculator.sumDate("2017-10-23","P1Y"));
		assertEquals(LocalDate.parse("2020-10-23"), scientifiStringCalculator.sumDate("2018-10-23","P2Y"));
	}
	
	@Test
	public void sum_date_whith_unlimited_periods(){
		assertEquals(LocalDate.parse("2019-10-23"), scientifiStringCalculator.sumDate("2017-10-23","P1Y,P1Y"));
		assertEquals(LocalDate.parse("2021-10-23"), scientifiStringCalculator.sumDate("2018-10-23","P2Y,P1Y"));
		assertEquals(LocalDate.parse("2021-12-28"), scientifiStringCalculator.sumDate("2018-10-23","P2Y,P1Y2M5D"));
	}


}
