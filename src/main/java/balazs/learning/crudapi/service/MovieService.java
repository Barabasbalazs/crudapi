package balazs.learning.crudapi.service;

import balazs.learning.crudapi.model.Movie;
import balazs.learning.crudapi.repo.MovieRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
