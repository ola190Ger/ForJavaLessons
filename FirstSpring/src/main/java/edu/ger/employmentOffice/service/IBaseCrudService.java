package edu.ger.employmentOffice.service;

import java.util.List;

public interface IBaseCrudService<T> {

    T create(T obj);
    T update(T obj);
    T get(String id);
    T delete (String id);
    List<T> getAll();
}
