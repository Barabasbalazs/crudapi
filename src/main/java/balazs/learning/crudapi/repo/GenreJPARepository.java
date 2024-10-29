package balazs.learning.crudapi.repo;

import balazs.learning.crudapi.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreJPARepository extends JpaRepository<Genre, Long> {}
