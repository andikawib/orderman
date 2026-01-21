package com.alnaghi.assessment.order.service;

import com.alnaghi.assessment.order.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OrderService {
    Page<Order> listOrders(Pageable pageable);
    Order createOrder(Order order);
    Order getOrderById(Long id);
    Order updateOrder(Long id, Order orderDetails);
    Order cancelOrder(Long id);
}
