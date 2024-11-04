package balazs.learning.crudapi.repo.jpa;

import balazs.learning.crudapi.model.Movie;
import balazs.learning.crudapi.repo.MovieRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieJPARepository extends JpaRepository<Movie, Long>, MovieRepository {}
