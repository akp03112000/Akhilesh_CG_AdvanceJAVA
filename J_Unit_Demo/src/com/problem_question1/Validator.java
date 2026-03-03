package com.problem_question1;

public class Validator {
	
	public boolean validateName(String name){
		if(name.length()>8) {
			return true;
		}else {
			return false;
		}
	}
	public boolean validateAge(int age) {
		if(age>=18 && age<=60) {
			return true;
		}else {
			return false;
		}
	}
	public void validate(Employee employee) throws InvalidNameException, InvalidAgeException {

        if (!validateName(employee.getName())) {
            throw new InvalidNameException("Invalid Name");
        }

        if (!validateAge(employee.getAge())) {
            throw new InvalidAgeException("Invalid Age");
        }
	}

}
