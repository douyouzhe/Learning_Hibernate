package com.dou.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        Student_Info student = new Student_Info();
        student.setName("dyz");
        student.setRollNo(1);

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        session.save(student);
        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}
