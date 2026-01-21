package com.alnaghi.assessment.order.repository;

import com.alnaghi.assessment.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
