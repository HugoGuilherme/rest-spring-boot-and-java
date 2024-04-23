package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {

		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedOperationException("Please set a numeric value!");
		}

		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	private boolean isNumeric(String number) {

		if (number == null) {
			return false;
		}

		return number.matches("-?\\d+(\\.\\d+)?");
	}

	private Double convertToDouble(String stringNumber) {

		if (stringNumber == null)
			return 0D;

		String number = stringNumber.replaceAll(",", ".");

		if (isNumeric(number))
			return Double.parseDouble(number);

		return 0D;
	}
}