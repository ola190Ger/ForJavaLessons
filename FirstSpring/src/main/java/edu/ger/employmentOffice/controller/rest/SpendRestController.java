package edu.ger.employmentOffice.controller.rest;

import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Spend;
import edu.ger.employmentOffice.service.IBaseCrudService;
import edu.ger.employmentOffice.service.role.Interfaces.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/spend")
@Api(value = "Spend", produces = MediaType.APPLICATION_JSON_VALUE)
public class SpendRestController {

    //@Autowired
    @Qualifier("SpendServiceImpl")
    IBaseCrudService<Spend> service;

    //get all
    @GetMapping("/list")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response= Spend.class)})
    List<Spend> getAll(){
        return service.getAll();
    }


    //get one which have id
    @GetMapping("/get/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Spend.class)})
    Spend get(@PathVariable(value="id") String id){
        return service.get(id);
    }

    //create new
    @PostMapping("/create")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Spend.class)})
    Spend create(@RequestBody Spend spend){

        return service.create(spend);
    }

    //update Spend which have id
    @PutMapping("/update")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Spend.class)})
    Spend update(@RequestBody Spend obj){//, @PathVariable String id){
        return service.update(obj);
    }

    // delete spend which have id
    @DeleteMapping("/delete/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Spend.class)})
    Spend del(@PathVariable String id){
        return service.delete(id);
    }
}
