package edu.ger.employmentOffice.controller.web;

import edu.ger.employmentOffice.model.Role;
import edu.ger.employmentOffice.model.Spend;
import edu.ger.employmentOffice.service.IBaseCrudService;
import edu.ger.employmentOffice.service.role.Interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/web/spend")
@Controller
public class SpendWebController {

    @Autowired
    @Qualifier("spendServiceImpl")
    IBaseCrudService<Spend> service;

    //get all
    @GetMapping("/get/list")
    String getAll(Model model){
        List<Spend> spends = service.getAll();
        model.addAttribute("spends", spends);
        spends.stream().forEach(item -> System.out.println(item));
        //write files name where will show categories
        return "spendGetList";
    }
}
