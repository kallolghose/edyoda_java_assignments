package com.edyoda.springmvcdemo.db.executions;

import com.edyoda.springmvcdemo.db.model.Course;
import com.edyoda.springmvcdemo.db.model.Instructor;
import com.edyoda.springmvcdemo.db.model.InstructorDetail;
import com.edyoda.springmvcdemo.db.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Many2Many {
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

            Course course = session.get(Course.class, 1);
            Student holland = session.get(Student.class, 3);

            course.addStudent(holland);

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
