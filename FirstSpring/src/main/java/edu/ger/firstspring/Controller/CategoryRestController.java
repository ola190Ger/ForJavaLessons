package edu.ger.firstspring.Controller;
/*
* controller for jobs category
* request tested "Postman"
* */
import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import edu.ger.firstspring.Model.Category;
import edu.ger.firstspring.service.category.Interfaces.ICategoryService;
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
