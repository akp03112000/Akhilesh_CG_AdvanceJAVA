package com.parameterized_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
	@ParameterizedTest
	@CsvSource
	({
		"2,4,6",
		"5,4,9",
		"99,1,100"
	})
	void testadd(int a, int b , int expected) {
		Calculator cal = new Calculator();
		assertEquals(expected, cal.add(a, b));
		
		
	}
	@ParameterizedTest
	@CsvFileSource(resources = "TestData.csv", numLinesToSkip=0)
	void testsub(int a, int b, int expected) {
		Calculator cal = new Calculator();
		assertEquals(expected,cal.sub(a,b));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "TestData1.csv", numLinesToSkip=0)
	void testmul(int a, int b, int expected) {
		Calculator cal = new Calculator();
		assertEquals(expected,cal.mul(a,b));
	}

}
