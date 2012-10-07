package com.shevchik.webportal.services;

import com.shevchik.webportal.domain.Image;
import com.shevchik.webportal.domain.Item;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 3:59 PM
 */

public interface ImageService {

    /**
     * add image
     * @param image
     */
    void addImage(Image image);

    /**
     * delete image
     * @param image
     */
    void deleteImage(Image image);

    /**
     * get by id
     * @param id
     * @return image
     */
    Image findById(int id);

    /**
     * get all images for given item
     * @param item
     * @return list of images
     */
    List<Image> getImagesForItem(Item item);
}
