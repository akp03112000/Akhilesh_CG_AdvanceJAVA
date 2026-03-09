package com.demo.calculator;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2,3);
		assertEquals(5,result);
	}
	@Test
	void testSub() {
		Calculator calculator = new Calculator();
		int result = calculator.sub(10,3);
		assertEquals(7,result);
		
	}
	@Test
	void testMul() {
		Calculator calculator = new Calculator();
		int result = calculator.mul(10,3);
		assertEquals(30,result);
		
	}
	@Test
	void testDiv() {
		Calculator calculator = new Calculator();
		int result = calculator.div(10,2);
		assertEquals(5,result);
		
	}
	
	// assert true
	@Test
	void testGreater() {
		Calculator calculator = new Calculator();
		boolean result = calculator.greater(10,2);
		assertTrue(result);
		
	}
	// assertFalse
	@Test
	void testSmaller() {
		Calculator calculator = new Calculator();
		boolean result = calculator.smaller(10,20);
		assertTrue(result);
	}
	
	//assertNull()
	@Test
	void testName() {
		Calculator calculator = new Calculator();
		String result = calculator.name("akp");
		assertNull(result);
	}
	// assertNotNull()
	
	@Test
	void testName1() {
		Calculator calculator = new Calculator();
		String result = calculator.name1("ak");
		assertNotNull(result);
		
	}



}

