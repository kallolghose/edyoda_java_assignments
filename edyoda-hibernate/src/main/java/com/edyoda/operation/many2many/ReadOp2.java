package com.edyoda.operation.many2many;

import com.edyoda.entity.Course;
import com.edyoda.entity.Instructor;
import com.edyoda.entity.InstructorDetail;
import com.edyoda.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadOp2 {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

            Student jitendar = session.get(Student.class, 2);
            for (Course course : jitendar.getCourses()){
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
