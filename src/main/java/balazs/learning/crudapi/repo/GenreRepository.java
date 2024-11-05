package balazs.learning.crudapi.repo;

import balazs.learning.crudapi.model.Genre;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CommonRepository<Genre> {}
