package balazs.learning.crudapi.repo;

import java.util.Collection;
import balazs.learning.crudapi.model.BaseEntity;

//defining all the crud operations for every DAO
public interface Dao<T extends BaseEntity> {

    Collection<T> findAll();

    Long create(T entity);

    T findById(long id);

    void delete(long id);
    
    T update(T entity);
}
