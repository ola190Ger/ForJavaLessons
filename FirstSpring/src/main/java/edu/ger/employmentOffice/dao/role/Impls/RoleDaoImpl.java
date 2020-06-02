package edu.ger.employmentOffice.dao.role.Impls;

import edu.ger.employmentOffice.dao.role.Interfaces.IRoleDao;
import edu.ger.employmentOffice.dataset.FakeDataset;
import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class RoleDaoImpl implements IRoleDao {
    //
    //fake role Implementation
    //
    @Autowired
    FakeDataset dataSet;

    @Override
    public Role create(Role role) {
        List<Integer> listId = this.getAll().stream()
                .map(el -> Integer.valueOf(el.getId()))
                .collect(Collectors.toList());
        Integer maxId = listId.stream().max(Comparator.naturalOrder()).orElse(0);
        if(role.getId()==null || role.getId().equals("string")) role.setId(String.valueOf(maxId+1));
        return this.getAll().add(role)?role:null;
    }

    @Override
    public Role update(Role role) {
        Role res = this.getAll().stream().filter(role1 -> role1.equals(role)).findFirst()
                .orElse(null);
        if (res==null){
            Integer maxId = this.getAll().stream().mapToInt(el->Integer.valueOf(el.getId()))
                    .max().orElse(0);
            role.setId(String.valueOf(maxId+1));
            return this.getAll().add(role)?role:null;
        }
        int indexRes= this.getAll().indexOf(res);
        res.setName(role.getName());
        return  this.getAll().set(indexRes, res);
    }

    @Override
    public Role get(String id) {

        return this.getAll().stream().filter(role1 -> role1.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Role delete(String id) {
        Role roleToDelete = this.get(id);
        this.getAll().remove(roleToDelete);
        return roleToDelete;
    }

    @Override
    public List<Role> getAll() {
        return dataSet.getRoles();
    }
}
