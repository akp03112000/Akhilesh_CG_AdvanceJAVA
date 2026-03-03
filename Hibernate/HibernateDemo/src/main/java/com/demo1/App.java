package com.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo1.entity.Passport;
import com.demo1.entity.Person;

public class App {

    public static void main(String[] args) {

        SessionFactory factory =
                new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Passport passport = new Passport(101, "India");
        Person person = new Person(1, "Akhilesh", passport);

        session.save(passport);
        session.save(person);

        tx.commit();
        session.close();
        factory.close();

        System.out.println("One-to-One mapping inserted");
    }
}