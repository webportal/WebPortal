package com.shevchik.webportal.repository;

import com.shevchik.webportal.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 10:15 AM
 */

public interface UserRepository extends CrudRepository<User, Integer> {

    /**
     * get user by id
     * @param name
     * @return user
     */
    User findByName(String name);
}
