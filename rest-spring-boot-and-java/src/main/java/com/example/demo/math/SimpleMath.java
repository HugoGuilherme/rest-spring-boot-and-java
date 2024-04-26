package com.example.demo.math;

import com.example.util.NumberConverter;

public class SimpleMath {

	public static Double operationResult(String operation, String numberOne, String numberTwo) {

		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedOperationException("Please set a numeric value!");
		}

		switch (operation) {
		case "sum": {

			return NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo);
		}
		case "sub": {

			return NumberConverter.convertToDouble(numberOne) - NumberConverter.convertToDouble(numberTwo);
		}
		case "mul": {

			return NumberConverter.convertToDouble(numberOne) * NumberConverter.convertToDouble(numberTwo);
		}
		case "div": {

			return NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
		}
		case "mean": {

			return (NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo)) / 2;
		}
		case "sqrt": {

			return Math.sqrt(NumberConverter.convertToDouble(numberOne));
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + operation);
		}
	}
}
