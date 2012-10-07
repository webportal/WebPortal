package com.shevchik.webportal.services.hibernate;

import com.shevchik.webportal.domain.Item;
import com.shevchik.webportal.domain.User;
import com.shevchik.webportal.repository.ItemRepository;
import com.shevchik.webportal.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 9:29 AM
 */

@Service("itemService")
@Repository
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void addItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void deleteItem(Item item) {
        itemRepository.delete(item);
    }

    @Override
    public Item findById(int id) {
        return itemRepository.findOne(id);
    }

    @Override
    public Item findByName(String name) {
        return itemRepository.findByName(name);
    }

    @Override
    public User getOwnerOfThisItem(Item item) {
        return itemRepository.getOwnerOfThisItem(item);
    }
}
