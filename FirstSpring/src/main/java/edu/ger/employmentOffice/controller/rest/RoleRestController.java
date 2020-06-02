package edu.ger.employmentOffice.controller.rest;


import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Role;
import edu.ger.employmentOffice.service.role.Interfaces.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
@Api(value = "Role", produces = MediaType.APPLICATION_JSON_VALUE)
public class RoleRestController {

    @Autowired
    IRoleService service;

    @GetMapping("/list")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response= Role.class)})
    List<Role> getAll(){
        return service.getAll();
    }

    //get one which have id
    @GetMapping("/get/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Role.class)})
    Role get(@PathVariable(value="id") String id){
        return service.get(id);
    }

    //create new role
    @PostMapping("/create")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Role.class)})
    Role create(@RequestBody Role role){

        return service.create(role);
    }

    //update role which have id
    @PutMapping("/update")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Role.class)})
    Role update(@RequestBody Role role){//, @PathVariable String id){
        return service.update(role);
    }

    // delete role which have id
    @DeleteMapping("/delete/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Role.class)})
    Role del(@PathVariable String id){
        return service.delete(id);
    }


}
