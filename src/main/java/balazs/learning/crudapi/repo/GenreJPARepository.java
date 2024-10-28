package balazs.learning.crudapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import balazs.learning.crudapi.model.Genre;

public interface GenreJPARepository extends JpaRepository<Genre, Long>{
    
}
