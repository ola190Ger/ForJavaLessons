package edu.ger.employmentOffice.service.vacancy.Impls;

import edu.ger.employmentOffice.model.Vacancy;
import edu.ger.employmentOffice.service.vacancy.Interfaces.IVacancyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VacancyServiceImpl implements IVacancyService {

    //CategoryServiceImpl serviceCategory;

    private List<Vacancy> vacancies = new ArrayList<>(
            Arrays.asList(
                    new Vacancy("1","Front-end developer"),
                    new Vacancy("2","Java developer"),
                    new Vacancy("3","UI/UX designer"),
                    new Vacancy("4","Cook"),
                    new Vacancy("5","Accountant")
            )
    );

    @Override
    public Vacancy create(Vacancy vacancy) {
        return null;
    }

    @Override
    public Vacancy update(Vacancy vacancy) {
        return null;
    }

    @Override
    public Vacancy get(String id) {
        return null;
    }

    @Override
    public Vacancy delete(String id) {
        return null;
    }

    @Override
    public List<Vacancy> getAll() {
        return vacancies;
    }
}
