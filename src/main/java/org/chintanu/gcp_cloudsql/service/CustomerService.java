package org.chintanu.gcp_cloudsql.service;

import org.chintanu.gcp_cloudsql.entity.Customer;

public interface CustomerService {

    public Customer getCustomerById(Integer customerId);
}
