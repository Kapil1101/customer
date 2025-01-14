package com.example.customerapp.service;

import com.example.customerapp.model.Customer;
import com.example.customerapp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }


    public List<Customer> fetchAll() {
        return customerRepository.findAll();
    }

    public Customer getByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }
}
