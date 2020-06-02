package edu.ger.employmentOffice.service.role.Interfaces;

import edu.ger.employmentOffice.model.Role;

import java.util.List;

public interface IRoleService {

    Role create(Role role);
    Role update(Role role);
    Role get(String id);
    Role delete (String id);
    List<Role> getAll();
}
