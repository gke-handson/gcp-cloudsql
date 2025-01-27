package org.chintanu.gcp_cloudsql.controller;

import org.chintanu.gcp_cloudsql.entity.Customer;
import org.chintanu.gcp_cloudsql.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/customers/")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(path = "hello")
    public ResponseEntity<String> hello() {

        return ResponseEntity.ok("Hello, can you hear me?");
    }

    @GetMapping(path = "{customerId}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") Integer customerId) {

        System.out.println("Customer Id : " + customerId);
        Customer customer = customerService.getCustomerById(customerId);
        return ResponseEntity.ok(customer);
    }
}
