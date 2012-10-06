package com.shevchik.webportal.services;

import com.shevchik.webportal.domain.Order;
import com.shevchik.webportal.domain.User;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 4:38 PM
 */
public interface OrderService {


    /**
     * add order
     * @param order
     */
    void addOrder(Order order);

    /**
     * delete order
     * @param order
     */
    void deleteOrder(Order order);

    /**
     * get order by id
     * @param id
     * @return order
     */
    Order getOrderById(int id);

    /**
     * get all orders for given user
     * @param user
     * @return list of orders
     */
    List<Order> getAllOrderForUser(User user);
}
