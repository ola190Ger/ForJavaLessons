package edu.ger.employmentOffice.dao.role.Interfaces;

import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Role;

import java.util.List;

public interface IRoleDao {

    Role create(Role role);
    Role update(Role role);
    Role get(String id);
    Role delete (String id);
    List<Role> getAll();
}
