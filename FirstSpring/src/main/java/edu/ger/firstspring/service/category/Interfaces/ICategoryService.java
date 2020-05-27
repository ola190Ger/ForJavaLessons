package edu.ger.firstspring.service.category.Interfaces;

import edu.ger.firstspring.Model.Category;
import edu.ger.firstspring.Model.Vacancy;

import java.util.List;

public interface ICategoryService {
    Category create(Category category);
    Category update(Category category);
    Category get(String id);
    Category delete(String id);
    List<Category> getAll();
}
