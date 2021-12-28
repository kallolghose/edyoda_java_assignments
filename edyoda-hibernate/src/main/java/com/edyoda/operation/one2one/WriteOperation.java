package com.edyoda.operation.one2one;

import com.edyoda.entity.Instructor;
import com.edyoda.entity.InstructorDetail;
import com.edyoda.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WriteOperation {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try {
            Instructor instructor = new Instructor("Yatin", "Sai", "yatinsai@gmail.com");
            InstructorDetail instructorDetail = new InstructorDetail("sy@twitter.com", "sy@linkedin.com");
            instructor.setInstructorDetail(instructorDetail);

            session.beginTransaction();
            //If no cascade property mentioned in @OneToOne annotation, then need to do below
            //session.save(instructorDetail);
            session.save(instructor);
            session.getTransaction().commit();

        }
        catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }

    }
}
