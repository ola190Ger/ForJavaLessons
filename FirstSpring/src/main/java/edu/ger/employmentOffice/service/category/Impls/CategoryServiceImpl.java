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
        return null;
        //return dao.add(category)?category:null;
    }

    @Override
    public Category update(Category category) {
        return null;

//        Category res = dao.getAll().stream().filter(category1 -> category.getId().equals(category1.getId())).findFirst()
//                .orElse(null);
//        if (res==null){
//            Category tmp = new Category(category.getId(), category.getName(), category.getDesc());
//            return dao.getAll().add(tmp)?tmp:null;
//        }
//        int indexRes= dao.getAll().indexOf(res);
//        res.setName(category.getName());
//        return  dao.getAll().set(indexRes, res);
    }

    @Override
    public Category get(String id) {
        return dao.getAll().stream().filter(category -> id.equals(category.getId())).findFirst().orElse(null);
    }

    @Override
    public Category delete(String id) {
        return null;
//        Category res=dao.getAll().stream().filter(category -> id.equals(category.getId())).findFirst().get();
//        dao.getAll().remove(res);
//        return dao.getAll().remove(res)?res:null;
    }

    @Override
    public List<Category> getAll() {
        return dao.getAll();
    }
}
