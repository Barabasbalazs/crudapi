package balazs.learning.crudapi.repo;

import balazs.learning.crudapi.model.Genre;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository {
    List<Genre> findAll();
}
