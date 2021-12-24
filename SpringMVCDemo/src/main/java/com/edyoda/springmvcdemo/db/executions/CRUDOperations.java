package com.edyoda.springmvcdemo.db.executions;

import com.edyoda.springmvcdemo.db.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class CRUDOperations {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        try{
            //Student student = new Student("Jitendar", "Kushwaha", "jitendar@gmail.com");
            session.beginTransaction();
            //session.save(student);
            //Student student = session.get(Student.class, 1);
            List<Student> students = session.createQuery("from Student")
                            .getResultList();
            for(Student student:students) {
                System.out.println(student.toString());
            }

            students = session.createQuery("from Student s where s.lastName='Holland'").getResultList();
            for (Student student : students){
                System.out.println(student);
            }

            Student kallol = session.get(Student.class, 1);
            kallol.setLastName("Ghosh");

            session.createQuery("update Student set email='something'").executeUpdate();

            session.delete(kallol);
            session.createQuery("delete from Student where id=1").executeUpdate();

            session.getTransaction().commit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }

}
