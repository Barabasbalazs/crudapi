package balazs.learning.crudapi.repo;

import balazs.learning.crudapi.model.Movie;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository {
    List<Movie> findAll();
}
