package edu.ger.employmentOffice.dao.tariff.Impls;

import edu.ger.employmentOffice.dao.IBaseCrudDao;
import edu.ger.employmentOffice.dataset.FakeDataset;
import edu.ger.employmentOffice.model.Spend;
import edu.ger.employmentOffice.model.Tariff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TariffDAOFakeImpl implements IBaseCrudDao<Tariff> {
    @Autowired
    FakeDataset dataset;

    @Override
    public Tariff create(Tariff obj) {
        List<Integer> listId = this.getAll().stream()
                .map(el -> Integer.valueOf(el.getId()))
                .collect(Collectors.toList());
        Integer maxId = listId.stream().max(Comparator.naturalOrder()).orElse(0);
        if(obj.getId()==null || obj.getId().equals("string")) obj.setId(String.valueOf(maxId+1));
        return this.getAll().add(obj)?obj:null;
    }

    @Override
    public Tariff update(Tariff obj) {
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
    public Tariff get(String id) {
        return this.getAll().stream()
                .filter(item -> id.equals(item.getId())).findFirst().orElse(null);
    }

    @Override
    public Tariff delete(String id) {
        Tariff res=this.getAll().stream().filter(item -> id.equals(item.getId())).findFirst().orElse(null);
        if(res==null)
            return null;
        //this.getAll().remove(res);
        return this.getAll().remove(res)?res:null;
    }

    @Override
    public List<Tariff> getAll() {
        return dataset.getTariffs();
    }
}
