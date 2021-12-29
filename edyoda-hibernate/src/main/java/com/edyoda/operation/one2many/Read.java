package com.edyoda.operation.one2many;

import com.edyoda.entity.Course;
import com.edyoda.entity.Instructor;
import com.edyoda.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

            Instructor yatinInstructor = session.get(Instructor.class, 2);
            for (Course course : yatinInstructor.getCourses()){
                System.out.println(course.toString());
            }

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
