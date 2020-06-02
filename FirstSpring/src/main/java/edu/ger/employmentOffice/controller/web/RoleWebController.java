package edu.ger.employmentOffice.controller.web;

import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Role;
import edu.ger.employmentOffice.service.category.Interfaces.ICategoryService;
import edu.ger.employmentOffice.service.role.Interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/web/role")
@Controller
public class RoleWebController {
    @Autowired
    IRoleService service;

    //get all
    @GetMapping("/get/list")
    String getAll(Model model){
        List<Role> roles = service.getAll();
        model.addAttribute("roles", roles);
        roles.stream().forEach(item -> System.out.println(item));
        //write files name where will show categories
        return "roleGetList";
    }
}
