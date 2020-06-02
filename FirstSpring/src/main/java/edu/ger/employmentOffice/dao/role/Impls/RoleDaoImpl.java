package edu.ger.employmentOffice.dao.role.Impls;

import edu.ger.employmentOffice.dao.role.Interfaces.IRoleDao;
import edu.ger.employmentOffice.model.Role;

import java.util.List;

public class RoleDaoImpl implements IRoleDao {
    @Override
    public Role create(Role role) {
        return null;
    }

    @Override
    public Role update(Role role) {
        return null;
    }

    @Override
    public Role get(String id) {

        return null;
    }

    @Override
    public Role delete(String id) {
        Role roleToDelete = this.get(id);
        this.getAll().remove(roleToDelete);
        return roleToDelete;
    }

    @Override
    public List<Role> getAll() {
        return null;
    }
}
