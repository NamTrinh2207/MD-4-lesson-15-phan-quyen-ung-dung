package com.example.jwtusingdatabase.service.role;

import com.example.jwtusingdatabase.model.Role;
import com.example.jwtusingdatabase.service.IGeneralService;

public interface IRoleService extends IGeneralService<Role> {
    Role findByName(String name);
}
