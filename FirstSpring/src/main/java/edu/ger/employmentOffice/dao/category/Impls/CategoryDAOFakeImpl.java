package edu.ger.employmentOffice.dao.category.Impls;

import edu.ger.employmentOffice.dao.category.Interfaces.ICategoryDAO;
import edu.ger.employmentOffice.dataset.FakeDataset;
import edu.ger.employmentOffice.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Integer> listId = this.getAll().stream()
                .map(el -> Integer.valueOf(el.getId()))
                .collect(Collectors.toList());
        Integer maxId = listId.stream().max(Comparator.naturalOrder()).orElse(0);
        if(category.getId()==null || category.getId().equals("string")) category.setId(String.valueOf(maxId+1));
        return this.getAll().add(category)?category:null;
    }

    @Override
    public Category update(Category category) {

         Category res = this.getAll().stream().filter(category1 -> category1.equals(category)).findFirst()
               .orElse(null);
           if (res==null){
               Integer maxId = this.getAll().stream().mapToInt(el->Integer.valueOf(el.getId()))
                       .max().orElse(0);
                category.setId(String.valueOf(maxId+1));
                return this.getAll().add(category)?category:null;
            }
           int indexRes= this.getAll().indexOf(res);
           res.setName(category.getName());
          return  this.getAll().set(indexRes, res);
    }

    @Override
    public Category get(String id) {

        return this.getAll().stream()
                .filter(category -> id.equals(category.getId())).findFirst().orElse(null);

    }

    @Override
    public Category delete(String id) {
        Category res=this.getAll().stream().filter(category -> id.equals(category.getId())).findFirst().orElse(null);
        if(res==null)
            return null;
        //this.getAll().remove(res);
        return this.getAll().remove(res)?res:null;
    }

    @Override
    public List<Category> getAll() {
        // u can insert pagination here
        return dataSet.getCategories();
    }
}
