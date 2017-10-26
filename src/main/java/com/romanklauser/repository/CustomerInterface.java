package com.romanklauser.repository;

import com.romanklauser.model.Customer;
import java.util.List;

public interface CustomerInterface {
    List<Customer> findAll();
}
