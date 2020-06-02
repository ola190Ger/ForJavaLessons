package edu.ger.employmentOffice.dao.vacancy.Impls;

import edu.ger.employmentOffice.dao.vacancy.Interfaces.IVacancyDAO;
import edu.ger.employmentOffice.dataset.FakeDataset;
import edu.ger.employmentOffice.model.Vacancy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class VacancyDAOFakeImpl implements IVacancyDAO {

    @Autowired
    FakeDataset dataBase;

    @Override
    public Vacancy create(Vacancy vacancy) {
        List<Integer> listId = this.getAll().stream()
                .map(el -> Integer.valueOf(el.getId()))
                .collect(Collectors.toList());
        Integer maxId = listId.stream().max(Comparator.naturalOrder()).orElse(0);
        if(vacancy.getId()==null || vacancy.getId().equals("string")) vacancy.setId(String.valueOf(maxId+1));
        return this.getAll().add(vacancy)?vacancy:null;
    }

    @Override
    public Vacancy update(Vacancy vacancy) {
        Vacancy res= this.getAll().stream()
                .filter(el -> el.equals(vacancy))
                .findFirst().orElse(null);
        if(res==null)
            this.create(vacancy);
        return this.getAll().set(this.getAll().indexOf(res),vacancy);
    }

    @Override
    public Vacancy get(String id) {
        return this.getAll().stream()
                .filter(el->el.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public Vacancy delete(String id) {
        Vacancy res= this.getAll().stream()
                .filter(el -> el.getId().equals(id))
                .findFirst().orElse(null);
        return this.getAll().remove(res)?res:null;
    }

    @Override
    public List<Vacancy> getAll() {
        return dataBase.getVacancies();
    }
}
