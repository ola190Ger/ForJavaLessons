package edu.ger.employmentOffice.service.vacancy.Impls;

import edu.ger.employmentOffice.dao.vacancy.Impls.VacancyDAOFakeImpl;
import edu.ger.employmentOffice.dao.vacancy.Interfaces.IVacancyDAO;
import edu.ger.employmentOffice.model.Vacancy;
import edu.ger.employmentOffice.service.vacancy.Interfaces.IVacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class VacancyServiceImpl implements IVacancyService {


    @Autowired
    VacancyDAOFakeImpl dao;


    @Override
    public Vacancy create(Vacancy vacancy) {
        return dao.create(vacancy);
    }

    @Override
    public Vacancy update(Vacancy vacancy) {
        return dao.update(vacancy);
    }

    @Override
    public Vacancy get(String id) {
        return dao.get(id);
    }

    @Override
    public Vacancy delete(String id) {
        return dao.delete(id);
    }

    @Override
    public List<Vacancy> getAll() {
        return dao.getAll();
    }
}
