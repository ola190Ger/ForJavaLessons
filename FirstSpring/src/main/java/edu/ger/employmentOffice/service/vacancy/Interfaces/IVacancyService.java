package edu.ger.employmentOffice.service.vacancy.Interfaces;

import edu.ger.employmentOffice.model.Vacancy;

import java.util.List;

public interface IVacancyService {

    Vacancy create(Vacancy vacancy);
    Vacancy update(Vacancy vacancy);
    Vacancy get(String id);
    Vacancy delete(String id);
    List<Vacancy> getAll();

}
