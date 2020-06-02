package edu.ger.employmentOffice.service.category.Impls;
/*
* Jobs category
* all functions are implemented
*
* */
import edu.ger.employmentOffice.dao.category.Impls.CategoryDAOFakeImpl;
import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.service.category.Interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    CategoryDAOFakeImpl dao;

    @Override
    public Category create(Category category) {
        return dao.create(category);
    }

    @Override
    public Category update(Category category) {
        return dao.update(category);
    }

    @Override
    public Category get(String id) {
        return dao.get(id);
    }

    @Override
    public Category delete(String id) {
        return dao.delete(id);
    }

    @Override
    public List<Category> getAll() {
        return dao.getAll();
    }
}
