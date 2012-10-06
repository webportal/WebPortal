package com.shevchik.webportal.services;

import com.shevchik.webportal.domain.Purchase;
import com.shevchik.webportal.domain.User;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 4:31 PM
 */
public interface PurchaseService {

    /**
     * add purchase
     * @param purchase
     */
    void addPurchase(Purchase purchase);

    /**
     * delete purchase
     * @param purchase
     */
    void deletePurchase(Purchase purchase);

    /**
     * get all purchases for given user
     * @param user
     * @return list of purchases
     */
    List<Purchase> getAllPurchasesForUser(User user);
}
