package balazs.learning.crudapi.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonRepository<T> {
    List<T> findAll();

    Optional<T> findById(Long id);
}
