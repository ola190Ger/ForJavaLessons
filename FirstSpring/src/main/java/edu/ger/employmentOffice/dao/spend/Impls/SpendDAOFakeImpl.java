package edu.ger.employmentOffice.dao.spend.Impls;

import edu.ger.employmentOffice.dao.IBaseCrudDao;
import edu.ger.employmentOffice.dataset.FakeDataset;
import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Spend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SpendDAOFakeImpl implements IBaseCrudDao<Spend> {

    @Autowired
    FakeDataset dataset;

    @Override
    public Spend create(Spend obj) {
        List<Integer> listId = this.getAll().stream()
                .map(el -> Integer.valueOf(el.getId()))
                .collect(Collectors.toList());
        Integer maxId = listId.stream().max(Comparator.naturalOrder()).orElse(0);
        if(obj.getId()==null || obj.getId().equals("string")) obj.setId(String.valueOf(maxId+1));
        return this.getAll().add(obj)?obj:null;
    }

    @Override
    public Spend update(Spend spend) {
        Spend res = this.getAll().stream().filter(item -> item.equals(spend)).findFirst()
                .orElse(null);
        if (res==null){
            Integer maxId = this.getAll().stream().mapToInt(el->Integer.valueOf(el.getId()))
                    .max().orElse(0);
            spend.setId(String.valueOf(maxId+1));
            return this.getAll().add(spend)?spend:null;
        }
        res.setName(spend.getName());
        return  this.getAll().set(this.getAll().indexOf(res), res);
    }

    @Override
    public Spend get(String id) {
        return this.getAll().stream()
                .filter(item -> id.equals(item.getId())).findFirst().orElse(null);
    }

    @Override
    public Spend delete(String id) {
        Spend res=this.getAll().stream().filter(item -> id.equals(item.getId())).findFirst().orElse(null);
        if(res==null)
            return null;
        //this.getAll().remove(res);
        return this.getAll().remove(res)?res:null;
    }

    @Override
    public List<Spend> getAll() {
        // u can insert pagination here
        return dataset.getSpends();
    }
}
