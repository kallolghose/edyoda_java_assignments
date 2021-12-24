package com.edyoda.operation;

import com.edyoda.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class ReadOperation {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter ID to read from DB : ");
            int id = scanner.nextInt();

            session.beginTransaction();

            //Fetching the data from DB based on Primary Key (ID)
            //If ID is not found then student id NULL
            Student student = session.get(Student.class, id);
            if(student!=null){
                System.out.println("Details of Fetched Student");
                System.out.println(student);
            }
            else{
                System.out.println("Student NOT Found");
            }

            System.out.println("\n ========== Get ALL data ================");
            //from Student is called -> HQL (Hibernate Query Language)
            List<Student> students = session.createQuery("from Student").getResultList();
            for(Student s : students){
                System.out.println(s);
            }

            System.out.println("\n=========== SEARCH BY FIRST NAME ===========");
            System.out.print("Enter First Name : ");
            String fName = scanner.next();
            //HQL -> from Student s where s.firstName='Tom'
            List<Student> fNameStudents =
                    session.createQuery(String.format("from Student s where s.firstName='%s'", fName)).getResultList();
            for(Student s : fNameStudents){
                System.out.println(s);
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
