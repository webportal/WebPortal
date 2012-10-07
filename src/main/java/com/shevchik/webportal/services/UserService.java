package com.shevchik.webportal.services;

import com.shevchik.webportal.domain.User;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 4:00 PM
 */

public interface UserService {

    /**
     * add user
     * @param user
     */
    void addUser(User user);

    /**
     * delete by id
     * @param id
     */
    void deleteById(int id);

    /**
     * get by id
     * @param id
     * @return user
     */
    User findById(int id);

    /**
     * get user by id
     * @param name
     * @return user
     */
    User findByName(String name);

    /**
     * get all users
     * @return list of users
     */
    List<User> getAllUsers();
}
