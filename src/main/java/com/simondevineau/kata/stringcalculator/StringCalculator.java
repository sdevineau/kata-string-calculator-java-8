package com.simondevineau.kata.stringcalculator;

public interface StringCalculator {

	public int sum(String input);

	public default String getBrand() {
		return "Casio";
	}

}
