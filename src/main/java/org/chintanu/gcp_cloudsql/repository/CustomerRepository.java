package org.chintanu.gcp_cloudsql.repository;

import org.chintanu.gcp_cloudsql.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
