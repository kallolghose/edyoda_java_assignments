package com.edyoda.springmvcdemo.db.executions;

import com.edyoda.springmvcdemo.db.model.Instructor;
import com.edyoda.springmvcdemo.db.model.InstructorDetail;
import com.edyoda.springmvcdemo.db.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class One2OneMain {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try{
            Instructor instructor = new Instructor("Kallol", "Ghose", "kallol.ghose@gmail.com");
            InstructorDetail instructorDetail = new InstructorDetail("channelname", "Football");
            instructor.setInstructorDetail(instructorDetail);

            session.beginTransaction();
            session.save(instructor);
            session.getTransaction().commit();

        }
        catch (Exception ex){
            session.getTransaction().rollback();
            ex.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
