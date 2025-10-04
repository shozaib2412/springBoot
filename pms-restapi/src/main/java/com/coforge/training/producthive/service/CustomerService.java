package com.coforge.training.producthive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coforge.training.producthive.model.Customer;
import com.coforge.training.producthive.repository.CustomerRepository;

/**
* Author	:Shozaib.Zulfiqar
* Date		:Oct 4, 2025
* Time 		:10:30:00 AM
* Project 	:com.coforge.training.producthive.service
*/

@Service
public class CustomerService {
	private final CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	
	public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Optional<Customer> getCustomerById(Long customerId) {
        return customerRepository.findById(customerId);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}
