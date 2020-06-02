package edu.ger.employmentOffice.service.spend.Impls;

import edu.ger.employmentOffice.dao.spend.Impls.SpendDAOFakeImpl;
import edu.ger.employmentOffice.model.Spend;
import edu.ger.employmentOffice.service.IBaseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpendServiceImpl implements IBaseCrudService<Spend> {
    @Autowired
    SpendDAOFakeImpl dao;
    @Override
    public Spend create(Spend obj) {
        return dao.create(obj);
    }

    @Override
    public Spend update(Spend obj) {
        return dao.update(obj);
    }

    @Override
    public Spend get(String id) {
        return dao.get(id);
    }

    @Override
    public Spend delete(String id) {
        return dao.delete(id);
    }

    @Override
    public List<Spend> getAll() {
        return dao.getAll();
    }
}
