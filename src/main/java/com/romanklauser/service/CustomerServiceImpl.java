package com.romanklauser.service;

import com.romanklauser.model.Customer;
import com.romanklauser.repository.CustomerRepository;
import com.romanklauser.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
