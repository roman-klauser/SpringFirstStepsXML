package com.romanklauser.repository;

import com.romanklauser.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();

        Customer customer = new Customer();
        customer.setFirstname("Roman");
        customer.setLastname("Klauser");

        customers.add(customer);

        return customers;
    }
}
