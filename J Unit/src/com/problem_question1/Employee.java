package com.problem_question1;

public class Employee {
	private String name;
	private double monthlySalary;
	private int age;
	
	public String getName() {
		return name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public int getAge() {
		return age;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public void setAge(int age) {
		this.age = age;
	}



	
	
	
	
	public double calculateAnnualSalary() {
		double annualSalary=0;
		if(age>=18 && age<=50) {
			 annualSalary=12*(monthlySalary+(monthlySalary*0.6));
		} else if(age>50 && age<=60) {
			 annualSalary=12*(monthlySalary+(monthlySalary*0.7));
		}
		return annualSalary;
		
	}
	
	
	 public void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Monthly Salary: " + monthlySalary);
	    }
	
	
	

}


