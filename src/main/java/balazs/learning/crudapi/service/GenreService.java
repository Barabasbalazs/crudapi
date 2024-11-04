package balazs.learning.crudapi.service;

import balazs.learning.crudapi.model.Genre;
import balazs.learning.crudapi.repo.GenreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    @Autowired GenreRepository genreRepository;

    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}