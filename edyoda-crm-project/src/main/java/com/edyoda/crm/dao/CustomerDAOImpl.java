package com.edyoda.crm.dao;

import com.edyoda.crm.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * We need to perform a logging before all the methods in the DAO Layer
 * We need to add some security before all the methods in the DAO Layer
 */

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Customer> getCustomers() {
        //Logging Statements
        //Statement1
        //Security Layer
        //Statement2

        Session currentSession = sessionFactory.getCurrentSession();
        Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
        List<Customer> customers = query.getResultList();
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {
        //Logging Statements
        //Statement1
        //Security Layer
        //Statement2

        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
    }
}
