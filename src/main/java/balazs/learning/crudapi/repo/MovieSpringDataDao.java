package balazs.learning.crudapi.repo;

import balazs.learning.crudapi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieSpringDataDao extends JpaRepository<Movie, Long> {

}