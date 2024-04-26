package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.math.SimpleMath;

@RestController
public class MathController {

	@GetMapping("/{operation}/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("operation") String operation, @PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo) {

		return SimpleMath.operationResult(operation, numberOne, numberTwo);
	}

}