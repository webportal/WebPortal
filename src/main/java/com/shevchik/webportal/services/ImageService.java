package com.shevchik.webportal.services;

import com.shevchik.webportal.domain.Image;

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
    Image getById(int id);
}
