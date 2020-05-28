package edu.ger.employmentOffice.service.category.Interfaces;

import edu.ger.employmentOffice.model.Category;

import java.util.List;

public interface ICategoryService {
    Category create(Category category);
    Category update(Category category);
    Category get(String id);
    Category delete(String id);
    List<Category> getAll();
}
