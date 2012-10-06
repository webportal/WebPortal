package com.shevchik.webportal.services;

import com.shevchik.webportal.domain.Item;
import com.shevchik.webportal.domain.User;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 4:16 PM
 */

public interface ItemService {

    /**
     * add item
     * @param item
     */
    void addItem(Item item);

    /**
     * delete item
     * @param item
     */
    void deleteItem(Item item);

    /**
     * get item by id
     * @return item
     */
    Item getItemById(int id);

    /**
     * get item by id
     * @param name
     * @return item
     */
    Item getItemByName(String name);

    /**
     * get owner of this item
     * @param item
     * @return user
     */
    User getOwnerOfThisItem(Item item);
}
