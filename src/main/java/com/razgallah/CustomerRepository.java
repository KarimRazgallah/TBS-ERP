package com.razgallah;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Karim Razgallah
 * @project TBS-ERP
 * @created 28-Dec-22
 */

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
