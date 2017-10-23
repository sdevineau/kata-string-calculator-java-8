package com.simondevineau.kata.stringcalculator;

import java.time.LocalDate;
import java.time.Period;

public class ScientificStringCalculator  implements StringCalculator{

	public static String sumDate(String date, String days) {
		LocalDate localDate = LocalDate.parse(date);
		return localDate.plusDays(Long.parseLong(days)).toString();
	}

	public static String sumDate(String date, String years, String months, String days) {
		Period period = Period.of(Integer.parseInt(years), Integer.parseInt(months), Integer.parseInt(days));
		return LocalDate.parse(date).plus(period).toString();
	}

	@Override
	public int sum(String input) {
		return 0;
	}

	@Override
	public String getBrand() {
		return null;
	}

	@Override
	public String setBrand() {
		return null;
	}

}
