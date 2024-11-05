package balazs.learning.crudapi.repo;

import balazs.learning.crudapi.model.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CommonRepository<Movie> {}
