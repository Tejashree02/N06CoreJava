package com.example.demo.CustormerRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;
@Repository

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>
{

}
