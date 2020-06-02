package edu.ger.employmentOffice.сontroller;


import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Role;
import edu.ger.employmentOffice.service.role.Interfaces.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/role")
@Api(value = "Role", produces = MediaType.APPLICATION_JSON_VALUE)
public class RoleRestController {

    @Autowired
    IRoleService service;

    @GetMapping("/list")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response= Role.class)})
    List<Role> getCategories(){
        return service.getAll();
    }


}
