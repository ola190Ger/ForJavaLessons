package edu.ger.employmentOffice.controller.rest;

import edu.ger.employmentOffice.model.Spend;
import edu.ger.employmentOffice.model.Tariff;
import edu.ger.employmentOffice.service.IBaseCrudService;
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
@RequestMapping("/api/tariff")
@Api(value = "Tariff", produces = MediaType.APPLICATION_JSON_VALUE)
public class TariffRestController {

    @Qualifier("TariffServiceImpl")
    IBaseCrudService<Tariff> service;

    //get all
    @GetMapping("/list")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response= Tariff.class)})
    List<Tariff> getAll(){
        return service.getAll();
    }


    //get one which have id
    @GetMapping("/get/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Tariff.class)})
    Tariff get(@PathVariable(value="id") String id){
        return service.get(id);
    }

    //create new
    @PostMapping("/create")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Tariff.class)})
    Tariff create(@RequestBody Tariff obj){

        return service.create(obj);
    }

    //update object which have id
    @PutMapping("/update")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Tariff.class)})
    Tariff update(@RequestBody Tariff obj){//, @PathVariable String id){
        return service.update(obj);
    }

    // delete object which have id
    @DeleteMapping("/delete/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Tariff.class)})
    Tariff del(@PathVariable String id){
        return service.delete(id);
    }
}
