package com.parameterized_test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EvenOddTest {
	@ParameterizedTest
	@CsvSource({
		"2,true",
		"3,false",
		"6,true",
		"11,false"
	})
	
	void testEvenOdd(int a, boolean expected) {
		EvenOdd evenodd = new EvenOdd();
		assertEquals(expected,evenodd.isOdd(a));
	}
	

}
