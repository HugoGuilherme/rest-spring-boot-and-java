package com.example.util;

public class NumberConverter {

	public static boolean isNumeric(String number) {

		if (number == null) {
			return false;
		}

		return number.matches("-?\\d+(\\.\\d+)?");
	}

	public static Double convertToDouble(String stringNumber) {

		if (stringNumber == null)
			return 0D;

		String number = stringNumber.replaceAll(",", ".");

		if (isNumeric(number))
			return Double.parseDouble(number);

		return 0D;
	}
}
