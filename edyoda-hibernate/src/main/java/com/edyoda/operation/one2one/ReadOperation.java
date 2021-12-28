package com.edyoda.operation.one2one;

import com.edyoda.entity.Instructor;
import com.edyoda.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadOperation {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
//            Instructor instructor = session.get(Instructor.class, 2);
//            if(instructor != null)
//                System.out.println(instructor);
//            else
//                System.out.println("NOT Found");
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, 2);
            System.out.println(instructorDetail.getInstructor());
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
