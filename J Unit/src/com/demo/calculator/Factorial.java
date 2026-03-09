package com.demo.calculator;

public class Factorial {
	public static int fact(int num) {
		int res = 1;
		for(int i =num; i>=1;i--) {
			 res *=i;
			 //return(res);
			
		}
		return(res);
	}/*
	public static void main(String[] args) {
		System.out.println(fact(10));
	}*/

}
