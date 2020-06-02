package edu.ger.employmentOffice.controller.rest;
/*
* controller for jobs category
* request tested "Postman"
* */

import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.service.category.Interfaces.ICategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/category")
@Api(value = "CategoryControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class CategoryRestController {

    @Autowired
    ICategoryService service;

    //get all in base
    @GetMapping("/list")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Category.class)})
    List<Category> getCategories(){
        return service.getAll();
    }


    //get one which have id
    @GetMapping("/get/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Category.class)})
    Category get(@PathVariable(value="id") String id){
        return service.get(id);
    }

    //create new category
    @PostMapping("/create")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Category.class)})
    Category create(@RequestBody Category category){

        return service.create(category);
    }

    //update category which have id
    @PutMapping("/update")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Category.class)})
    Category update(@RequestBody Category category){//, @PathVariable String id){
        return service.update(category);
    }

    // delete category which have id
    @DeleteMapping("/delete/{id}")
    @ApiResponses(value = {@ApiResponse(code=200, message = "OK", response=Category.class)})
    Category del(@PathVariable String id){
        return service.delete(id);
    }

}
