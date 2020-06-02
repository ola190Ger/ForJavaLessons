package edu.ger.employmentOffice.service.role.Impls;

import edu.ger.employmentOffice.dao.role.Impls.RoleDaoImpl;
import edu.ger.employmentOffice.model.Role;
import edu.ger.employmentOffice.service.role.Interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    RoleDaoImpl dao;
    @Override
    public Role create(Role role) {
        return dao.create(role);
    }

    @Override
    public Role update(Role role) {
        return dao.update(role);
    }

    @Override
    public Role get(String id) {
        return dao.get(id);
    }

    @Override
    public Role delete(String id) {
        return dao.delete(id);
    }

    @Override
    public List<Role> getAll() {
        return dao.getAll();
    }
}
