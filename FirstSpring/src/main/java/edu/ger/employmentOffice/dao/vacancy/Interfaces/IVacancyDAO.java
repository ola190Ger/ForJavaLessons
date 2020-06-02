package edu.ger.employmentOffice.dao.vacancy.Interfaces;

import edu.ger.employmentOffice.model.Category;
import edu.ger.employmentOffice.model.Vacancy;

import java.util.List;

public interface IVacancyDAO {
    Vacancy create(Vacancy vacancy);
    Vacancy update(Vacancy vacancy);
    Vacancy get(String id);
    Vacancy delete (String id);
    List<Vacancy> getAll();
}
