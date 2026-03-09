
package com.mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mapping.entity.Aadhaar;
import com.mapping.entity.Person;

public class App {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Person person = new Person(2, "Akhilesh");
        Aadhaar aadhaar = new Aadhaar(2002, "Punjab");

        person.setAadhaar(aadhaar);
        aadhaar.setPerson(person);

        session.save(aadhaar);
        session.save(person);

        tx.commit();

        session.close();
        factory.close();

        System.out.println("Person-Aadhaar One-to-One mapping done");
    }
}