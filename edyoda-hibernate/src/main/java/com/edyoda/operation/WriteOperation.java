package com.edyoda.operation;

import com.edyoda.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class WriteOperation {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            Student student1 = new Student("Tom", "Hardy", "tomhardy@gmail.com");
            Student student2 = new Student("Tom", "Hanks", "tomhanks@gmail.com");

            //Start a transaction
            session.beginTransaction();

            //Perform the db operation
            //Write to DB
            session.save(student1);
            session.save(student2);

            //Commit the transaction
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
