package edu.ger.employmentOffice.сontroller;
/*
* 1 controller implemented
*
* */
import edu.ger.employmentOffice.model.Vacancy;
import edu.ger.employmentOffice.service.vacancy.Impls.VacancyServiceImpl;
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
