
	package com.mapping.entity;

	import javax.persistence.*;

	@Entity
	public class Person {

	    @Id
	    private int id;
	    private String name;

	    @OneToOne
	    @JoinColumn(name="aadhaar_id")
	    private Aadhaar aadhaar;

	    public Person() {}

	    public Person(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public void setAadhaar(Aadhaar aadhaar) {
	        this.aadhaar = aadhaar;
	    
	}
}
