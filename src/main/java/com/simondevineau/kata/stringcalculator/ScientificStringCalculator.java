package com.simondevineau.kata.stringcalculator;

import java.time.LocalDate;
import java.util.stream.Stream;

public class ScientificStringCalculator implements StringCalculator {

	private String brand;

	@Override
	public int sum(String input) {
		return 0;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	public String setBrand(String brand) {
		return this.brand = brand;
	}

	public LocalDate sumDate(String date, String input) {
		if (date.isEmpty()) {
			date = LocalDate.MIN.toString();
		}
		if (input.isEmpty()) {
			return LocalDate.parse(date);
		}
		LocalDate initialDate = LocalDate.parse(date);
		int period = Stream.of(input.split(",")).mapToInt(d -> Integer.parseInt(d)).sum();

		return initialDate.plusDays(period);

	}

}
