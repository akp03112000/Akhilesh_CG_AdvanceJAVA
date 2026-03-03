package com.demo.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
	@Test
	void testName() {
		Palindrome palindrome = new Palindrome();
		String result = palindrome.palindromecheck("aki");
		//assertEquals("Palindrome",result);
		
		assertEquals("Non-Palindrome",result);
		
	}

	

}
