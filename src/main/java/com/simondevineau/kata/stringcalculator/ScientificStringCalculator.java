package com.simondevineau.kata.stringcalculator;

import java.time.LocalDate;
import java.time.Period;
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
		Period p = parseInput(input);
		return initialDate.plus(p);

	}

	private Period parseInput(String input) {
		Period p;
		if (isPeriod(input)) {
			p = Stream.of(input.split(",")).
					map(period -> Period.parse(period)).
					reduce((x, y) -> x.plus(y)).
					get();
		} else {
			int numDays = Stream.of(input.split(",")).
					mapToInt(d -> Integer.parseInt(d)).
					sum();
			p = Period.ofDays(numDays);
		}
		return p;
	}

	private boolean isPeriod(String input) {
		return input.startsWith("P");
	}

}
