package com.example.demo.OrderDetailsRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.OrderDetails.OrderDetails;
@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer> {

}
