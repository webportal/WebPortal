package com.shevchik.webportal.repository;

import com.shevchik.webportal.domain.Order;
import com.shevchik.webportal.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 10:03 AM
 */
public interface OrderRepository extends CrudRepository<Order, Integer> {

    /**
     * get all orders for given user
     * @param user
     * @return list of orders
     */
    List<Order> getAllOrderForUser(User user);
}
