package com.problem_question1;

public class Main_Class {
	

	    public static void main(String[] args) {

	        Employee emp = new Employee();
	        emp.setName("Maria Francis");
	        emp.setAge(18);
	        emp.setMonthlySalary(2000);

	        Validator validator = new Validator();

	        try {
	            validator.validate(emp);
	            double annualSalary = emp.calculateAnnualSalary();
	            System.out.println("Annual Salary: " + annualSalary);
	        } 
	        catch (InvalidNameException | InvalidAgeException e) {
	            System.out.println(e.getMessage());
	        
	    }
	}


}
