package edu.ger.employmentOffice.controller.rest;
/*
* 1 controller implemented
*
* */
import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Vacancy;
import edu.ger.employmentOffice.service.vacancy.Impls.VacancyServiceImpl;
import edu.ger.employmentOffice.service.vacancy.Interfaces.IVacancyService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/vacancy")
public class VacancyRestController {

    @Autowired
    IVacancyService service;

    //get list
    @RequestMapping("/list")
    List<Vacancy> getVacancies(){
        return service.getAll();
    }

    //get one which have id
    @GetMapping("/get/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response= Vacancy.class)})
    Vacancy get(@PathVariable(value="id") String id){
        return service.get(id);
    }

    //create new category
    @PostMapping("/create")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Vacancy.class)})
    Vacancy create(@RequestBody Vacancy vacancy){

        return service.create(vacancy);
    }

    //update category which have id
    @PutMapping("/update")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Vacancy.class)})
    Vacancy update(@RequestBody Vacancy vacancy){//, @PathVariable String id){
        return service.update(vacancy);
    }

    // delete category which have id
    @DeleteMapping("/delete/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Vacancy.class)})
    Vacancy del(@PathVariable String id){
        return service.delete(id);
    }


}
