package edu.ger.employmentOffice.controller.web;

import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.service.category.Interfaces.ICategoryService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/web/category")
@Controller
public class CategoryWebController {
    @Autowired
    ICategoryService service;

    //get all
    @GetMapping("/get/list")
    String getCategories(Model model){
        List<Category> categories = service.getAll();
        model.addAttribute("categories", categories);
        categories.stream().forEach(item -> System.out.println(item));
        //write files name where will get categories
        return "categoryGetList";
    }




    //get one which have id
    @GetMapping("/get/{id}")
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
