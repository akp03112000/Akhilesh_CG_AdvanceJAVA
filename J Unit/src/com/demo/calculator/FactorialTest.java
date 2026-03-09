package com.demo.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FactorialTest {
	@Test
	void testfact() {
	Factorial factorial = new Factorial();
	int res = factorial.fact(5);
	assertEquals(120,res);

}
}
