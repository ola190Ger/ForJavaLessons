package edu.ger.employmentOffice.dao;

import edu.ger.employmentOffice.dataset.FakeDataset;
import edu.ger.employmentOffice.model.Spend;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BaseCrudDaoImpl<T> {//implements IBaseCrudDao {

/*    private final FakeDataset dataset;

    public BaseCrudDaoImpl(FakeDataset dataset) {
        this.dataset = dataset;
    }


    @Override
    public Object create(Object obj) {
        List<Integer> listId = this.getAll().stream()
                .map(el -> Integer.valueOf(el.getId()))
                .collect(Collectors.toList());
        Integer maxId = listId.stream().max(Comparator.naturalOrder()).orElse(0);
        if(obj.getId()==null || obj.getId().equals("string")) obj.setId(String.valueOf(maxId+1));
        return this.getAll().add(obj)?obj:null;
    }

    @Override
    public Object update(Object obj) {
        Object res = this.getAll().stream().filter(item -> item.equals(obj)).findFirst()
                .orElse(null);
        if (res==null){
            Integer maxId = this.getAll().stream().mapToInt(el->Integer.valueOf(el.getId()))
                    .max().orElse(0);
            obj.setId(String.valueOf(maxId+1));
            return this.getAll().add(obj)?obj:null;
        }
        obj.setName(obj.getName());
        return  this.getAll().set(this.getAll().indexOf(res), obj);
    }

    @Override
    public Object get(String id) {
        return this.getAll().stream()
                .filter(item -> id.equals(item.getId())).findFirst().orElse(null);
    }

    @Override
    public Object delete(String id) {
        Object res=this.getAll().stream().filter(item -> id.equals(item.getId())).findFirst().orElse(null);
        if(res==null)
            return null;
        //this.getAll().remove(res);
        return this.getAll().remove(res)?res:null;
    }

    @Override
    public List<T> getAll() {
        return dataset.getCategories();;
    }*/
}
