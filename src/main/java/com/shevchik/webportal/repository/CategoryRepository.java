package com.shevchik.webportal.repository;

import com.shevchik.webportal.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 10:20 PM
 */
public interface CategoryRepository extends CrudRepository<Category, Integer> {

    /**
     * get root categories
     * @return
     */
    List<Category> getRootCategories();

    /**
     * find by name
     * @param name
     * @return category
     */
    Category findByName(String name);

    /**
     * get subcategories
     * @param category
     * @return list of categories
     */
    List<Category> getSubCategories(Category category);

    /**
     * get parent categories
     * @param category
     * @return list of categories
     */
    List<Category> getParentCategory(Category category);
}
