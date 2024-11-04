package balazs.learning.crudapi.repo.jpa;

import balazs.learning.crudapi.model.Genre;
import balazs.learning.crudapi.repo.GenreRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreJPARepository extends JpaRepository<Genre, Long>, GenreRepository {}
