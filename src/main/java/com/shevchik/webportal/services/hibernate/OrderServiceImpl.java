package com.shevchik.webportal.services.hibernate;

import com.shevchik.webportal.domain.Order;
import com.shevchik.webportal.domain.User;
import com.shevchik.webportal.repository.OrderRepository;
import com.shevchik.webportal.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 10:01 AM
 */

@Service("orderService")
@Repository
@Transactional
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }

    @Override
    public Order findById(int id) {
        return orderRepository.findOne(id);
    }

    @Override
    public List<Order> getAllOrderForUser(User user) {
        return orderRepository.getAllOrderForUser(user);
    }
}
