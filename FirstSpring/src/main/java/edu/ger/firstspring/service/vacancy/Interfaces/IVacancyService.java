package edu.ger.firstspring.service.vacancy.Interfaces;

import edu.ger.firstspring.Model.Vacancy;

import java.util.List;

public interface IVacancyService {

    Vacancy create(Vacancy vacancy);
    Vacancy update(Vacancy vacancy);
    Vacancy get(String id);
    Vacancy delete(String id);
    List<Vacancy> getAll();

}
