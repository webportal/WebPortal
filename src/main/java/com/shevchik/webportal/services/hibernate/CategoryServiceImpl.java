package com.shevchik.webportal.services.hibernate;

import com.shevchik.webportal.domain.Category;
import com.shevchik.webportal.repository.CategoryRepository;
import com.shevchik.webportal.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: dmytro
 * Date: 10/6/12
 * Time: 10:26 PM
 */

@Service("categoryService")
@Repository
@Transactional
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void addCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public Category findByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public List<Category> getRootCategories() {
        return categoryRepository.getRootCategories();
    }

    @Override
    public List<Category> getSubCategories(Category category) {
        return categoryRepository.getSubCategories(category);
    }

    @Override
    public List<Category> getParentCategory(Category category) {
        return categoryRepository.getParentCategory(category);
    }
}
