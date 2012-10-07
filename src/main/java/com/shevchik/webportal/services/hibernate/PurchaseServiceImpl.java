package com.shevchik.webportal.services.hibernate;

import com.shevchik.webportal.domain.Purchase;
import com.shevchik.webportal.domain.User;
import com.shevchik.webportal.repository.PurchaseRepository;
import com.shevchik.webportal.services.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 10:09 AM
 */

@Service("purchaseService")
@Repository
@Transactional
public class PurchaseServiceImpl implements PurchaseService{

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public void addPurchase(Purchase purchase) {
        purchaseRepository.save(purchase);
    }

    @Override
    public void deletePurchase(Purchase purchase) {
        purchaseRepository.delete(purchase);
    }

    @Override
    public List<Purchase> getAllPurchasesForUser(User user) {
        return purchaseRepository.getAllPurchasesForUser(user);
    }
}
