package com.edyoda.operation;

import com.edyoda.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DeleteOperation {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{
            System.out.println("==== Delete By ID ===");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter ID to delete from DB : ");
            int id = scanner.nextInt();

            session.beginTransaction();
            Student student =  session.get(Student.class, id);
            if(student != null){
                session.delete(student);
                System.out.println(String.format("Student with ID %d Deleted", id));
            }
            else {
                System.out.println("Student NOT Found !!");
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
