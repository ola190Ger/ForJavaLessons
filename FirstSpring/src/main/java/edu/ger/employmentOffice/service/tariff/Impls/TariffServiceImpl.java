package edu.ger.employmentOffice.service.tariff.Impls;

import edu.ger.employmentOffice.dao.tariff.Impls.TariffDAOFakeImpl;
import edu.ger.employmentOffice.dataset.FakeDataset;
import edu.ger.employmentOffice.model.Tariff;
import edu.ger.employmentOffice.service.IBaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TariffServiceImpl implements IBaseCrudService<Tariff> {
    @Autowired
    TariffDAOFakeImpl dao;


    @Override
    public Tariff create(Tariff obj) {
        return dao.create(obj);
    }

    @Override
    public Tariff update(Tariff obj) {
        return dao.update(obj);
    }

    @Override
    public Tariff get(String id) {
        return dao.get(id);
    }

    @Override
    public Tariff delete(String id) {
        return dao.delete(id);
    }

    @Override
    public List<Tariff> getAll() {
        return dao.getAll();
    }
}
