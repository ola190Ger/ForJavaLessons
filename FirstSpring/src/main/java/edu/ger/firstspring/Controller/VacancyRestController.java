package edu.ger.firstspring.Controller;
/*
* 1 controller implemented
*
* */
import edu.ger.firstspring.Model.Vacancy;
import edu.ger.firstspring.service.vacancy.Impls.VacancyServiceImpl;
import edu.ger.firstspring.service.vacancy.Interfaces.IVacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/vacancy")
public class VacancyRestController {

    @Autowired
    VacancyServiceImpl service;
    //IVacancyService service;

    @RequestMapping("/list")
    List<Vacancy> getVacancies(){
        return service.getAll();
    }


}
