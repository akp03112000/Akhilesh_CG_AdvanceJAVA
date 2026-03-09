
package com.mapping.entity;

import javax.persistence.*;

@Entity
public class Aadhaar {

    @Id
    private int aadhaarId;
    private String address;

    @OneToOne(mappedBy = "aadhaar")
    private Person person;

    public Aadhaar() {}

    public Aadhaar(int aadhaarId, String address) {
        this.aadhaarId = aadhaarId;
        this.address = address;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
