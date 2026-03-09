package com.demo.calculator;

public class Palindrome {
	
	public static String palindromecheck(String input) {
		StringBuilder sb =new StringBuilder(input);
		StringBuilder sb1 = new StringBuilder(sb.reverse());
		String s = sb1.toString();
		return (s.equals(input) ? "Palindrome":"Non-Palindrome");
		
		}
	public static void main(String[] args) {
		String s = "aki";
		System.out.println(palindromecheck(s));
	}
	
	}


