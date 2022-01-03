package com.edyoda.crm.dao;

import com.edyoda.crm.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
        List<Customer> customers = query.getResultList();
        return customers;
    }

}
