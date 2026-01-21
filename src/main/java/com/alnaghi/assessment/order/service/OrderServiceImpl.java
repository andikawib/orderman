package com.alnaghi.assessment.order.service;

import com.alnaghi.assessment.order.entity.Order;
import com.alnaghi.assessment.order.entity.OrderStatus;
import com.alnaghi.assessment.order.repository.OrderRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    public Page<Order> listOrders(Pageable pageable) {
        return repository.findAll(pageable);
    }

    public Order createOrder(Order order) {
        order.setStatus(OrderStatus.PENDING);
        return repository.save(order);
    }

    public Order getOrderById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Transactional
    public Order updateOrder(Long id, Order orderDetails) {
        Order order = getOrderById(id);
        order.setCustomerName(orderDetails.getCustomerName());
        order.setTotalAmount(orderDetails.getTotalAmount());
        return repository.save(order);
    }

    @Transactional
    public Order cancelOrder(Long id) {
        Order order = getOrderById(id);
        order.setStatus(OrderStatus.CANCELLED);
        return repository.save(order);
    }
}
