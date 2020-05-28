package edu.ger.employmentOffice.dao.category.Impls;

import edu.ger.employmentOffice.dao.category.Interfaces.ICategoryDAO;
import edu.ger.employmentOffice.dataset.FakeDataset;
import edu.ger.employmentOffice.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDAOFakeImpl implements ICategoryDAO {
/*
 * Stupid Fake Implementation
 */

    @Autowired
    FakeDataset dataSet;
/*    развернутый аналог :
    private final FakeDataset dataset;

    @Autowired //
    public CategoryDAOFakeImpl(FakeDataset dataset) {
        this.dataset = dataset;
    }*/

    @Override
    public Category create(Category category) {
        return null;
    }

    @Override
    public Category update(Category category) {
        return null;
    }

    @Override
    public Category get(String id) {
        return null;
    }

    @Override
    public Category delete(String id) {
        return null;
    }

    @Override
    public List<Category> getAll() {
        // u can insert pagination
        return dataSet.getCategories();
    }
}
