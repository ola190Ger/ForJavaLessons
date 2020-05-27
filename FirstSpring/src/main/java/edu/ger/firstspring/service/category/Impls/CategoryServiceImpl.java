package edu.ger.firstspring.service.category.Impls;
/*
* Jobs category
* all functions are implemented
*
* */
import edu.ger.firstspring.Model.Category;
import edu.ger.firstspring.Model.Vacancy;
import edu.ger.firstspring.service.category.Interfaces.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    private List<Category> categories = new ArrayList<Category>(
            Arrays.asList(
                    new Category("1", "Finance"),
                    new Category("2", "IT"),
                    new Category("3", "Gastronomy")
            )
    );

    @Override
    public Category create(Category category) {

        return categories.add(category)?category:null;
    }

    @Override
    public Category update(Category category) {

        Category res = categories.stream().filter(category1 -> category.getId().equals(category1.getId())).findFirst()
                .orElse(null);
        if (res==null){
            Category tmp = new Category(category.getId(), category.getName());
            return categories.add(tmp)?tmp:null;
        }
        int indexRes= categories.indexOf(res);
        res.setName(category.getName());
        return  categories.set(indexRes, res);
    }

    @Override
    public Category get(String id) {
        return categories.stream().filter(category -> id.equals(category.getId())).findFirst().orElse(null);
    }

    @Override
    public Category delete(String id) {
        Category res=categories.stream().filter(category -> id.equals(category.getId())).findFirst().get();
        categories.remove(res);
        return categories.remove(res)?res:null;
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }
}
