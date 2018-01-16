package com.dou.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Student_Info student = new Student_Info();
        Student_Info student1 = new Student_Info();
        student.setName("dyz");
        student1.setName("kj");
        //student.setRollNo(1);
        //student.setBirthDay(new Date());

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        session.save(student);
        session.save(student1);
        session.getTransaction().commit();
        session.close();
        sf.close();
    }
}
