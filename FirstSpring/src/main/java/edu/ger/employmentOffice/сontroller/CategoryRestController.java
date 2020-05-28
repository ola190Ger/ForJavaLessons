package edu.ger.employmentOffice.сontroller;
/*
* controller for jobs category
* request tested "Postman"
* */
import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.service.category.Interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryRestController {

    @Autowired
    ICategoryService service;

    @RequestMapping("/list")
    List<Category> getCategories(){
        return service.getAll();
    }

    //@RequestMapping("/specimen/{id}")
    @GetMapping("/specimen")
    Category get(@RequestParam String id){
        return service.get(id);
    }

    @PostMapping("/create")
    Category create(@RequestBody Category category){
        return service.create(category);
    }

    @PutMapping("/update")
    Category update(@RequestBody Category category){//, @PathVariable String id){
        return service.update(category);
    }

    //@RequestMapping("/delete")
    @DeleteMapping("/delete")
    Category delete(@RequestParam String id){
        return service.delete(id);
    }

}
