package com.edyoda.springmvcdemo.db.executions;

import com.edyoda.springmvcdemo.db.model.Course;
import com.edyoda.springmvcdemo.db.model.Instructor;
import com.edyoda.springmvcdemo.db.model.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class One2ManyOperation {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try{
//            Instructor instructor = new Instructor("Kallol", "Ghose", "kallol.ghose@gmail.com");
//            InstructorDetail instructorDetail = new InstructorDetail("ghoseka", "myprofile@linkedin");
//            instructor.setInstructorDetail(instructorDetail);

            session.beginTransaction();
            Instructor instructor = session.get(Instructor.class, 3);
            Course javaCourse = new Course("JAVA");
            Course pythonCourse = new Course("Python");
            instructor.addCourse(javaCourse);
            instructor.addCourse(pythonCourse);

            session.save(javaCourse);
            session.save(pythonCourse);

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
