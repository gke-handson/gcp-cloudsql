package org.chintanu.gcp_cloudsql.service;

import org.chintanu.gcp_cloudsql.entity.Customer;
import org.chintanu.gcp_cloudsql.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(Integer customerId) {
        Optional<Customer> customer = customerRepository.findById(customerId);
        return customer.orElse(null);
    }
}
