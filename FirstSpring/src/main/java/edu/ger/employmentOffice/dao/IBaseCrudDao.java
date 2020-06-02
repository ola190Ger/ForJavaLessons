package edu.ger.employmentOffice.dao;

import java.util.List;

public interface IBaseCrudDao<T> {
    T create(T obj);
    T update(T obj);
    T get(String id);
    T delete (String id);
    List<T> getAll();
}
