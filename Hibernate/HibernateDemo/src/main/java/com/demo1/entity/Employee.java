package com.demo1.entity;



	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="employee")
	public class Employee {

	    @Id
	    private int id;
	    private String name;
	    private double salary;

	    public Employee() {}

	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    
	}

}
