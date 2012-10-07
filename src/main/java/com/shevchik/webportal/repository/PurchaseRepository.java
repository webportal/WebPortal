package com.shevchik.webportal.repository;

import com.shevchik.webportal.domain.Purchase;
import com.shevchik.webportal.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 10:10 AM
 */
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {

    /**
     * get all purchases for given user
     * @param user
     * @return list of purchases
     */
    List<Purchase> getAllPurchasesForUser(User user);
}
