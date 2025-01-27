package com.example.assignment4.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.assignment4.models.CustomerModel;
import com.example.assignment4.repositories.CustomerRepository;

@Service
public class CustomerService 
{
    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerModel> getAllCustomers() 
    {
        return customerRepository.findAll();
    }
    
    public CustomerModel getCustomer(int id) 
    {
        return customerRepository.findById(id).orElse(null);
    }

    public CustomerModel saveCustomer(CustomerModel customer) 
    {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(int id) 
    {
        customerRepository.deleteById(id);
    }
}
