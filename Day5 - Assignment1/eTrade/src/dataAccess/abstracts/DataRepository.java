package dataAccess.abstracts;

import java.util.List;

public interface DataRepository<T> {
    List<T> getAll();
    T getById(int id);
    void add(T entity);
    void delete(T entity);
    void update(T entity);
}
