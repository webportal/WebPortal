package com.shevchik.webportal.repository;

import com.shevchik.webportal.domain.Image;
import com.shevchik.webportal.domain.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/7/12
 * Time: 9:17 AM
 */

public interface ImageRepository extends CrudRepository<Image, Integer> {

    /**
     * get all images for given item
     * @param item
     * @return list of images
     */
    List<Image> getImagesForItem(Item item);
}
