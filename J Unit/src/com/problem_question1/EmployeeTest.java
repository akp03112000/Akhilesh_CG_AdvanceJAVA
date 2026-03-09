package com.problem_question1;


	
	import static org.junit.Assert.*;
	import org.junit.Test;

	public class EmployeeTest {

	    @Test
	    public void calculateAnnualSalaryTest() {
	        Employee emp = new Employee();
	        emp.setName("Maria Francis");
	        emp.setAge(18);
	        emp.setMonthlySalary(2000);

	        double result = emp.calculateAnnualSalary();
	        assertEquals(25440, result, 0.01);
	    
	}


}
