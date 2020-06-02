package edu.ger.employmentOffice.service;

import edu.ger.employmentOffice.dao.IBaseCrudDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseCrudServiceImpl<T> implements IBaseCrudService {
//    @Autowired
//    IBaseCrudDao<T> dao;

    @Override
    public Object create(Object obj) {
        return null;
    }

    @Override
    public Object update(Object obj) {
        return null;
    }

    @Override
    public Object get(String id) {
        return null;
    }

    @Override
    public Object delete(String id) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }
}
