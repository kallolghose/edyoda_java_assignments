package com.edyoda.operation.basic;

import com.edyoda.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class UpdateOperation {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try{
            System.out.println("==== Update First Name for any given ID and save to DB ===");
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Please enter ID to read from DB : ");
//            int id = scanner.nextInt();

            session.beginTransaction();
//            Student student = session.get(Student.class, id);
//            if(student != null){
//                System.out.print("Enter First Name to be Updated : ");
//                String fName = scanner.next();
//                student.setFirstName(fName);
//            }
//            else{
//                System.out.println("Student NOT found !!");
//            }

            //Update all the first name to Thomas whose first name is Tom
            session.createQuery("update Student s set s.firstName='Thomas' where s.firstName='Tom'").executeUpdate();

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
