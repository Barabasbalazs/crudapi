package balazs.learning.crudapi.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import balazs.learning.crudapi.model.Movie;
import balazs.learning.crudapi.repo.MovieJPARepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private static final Logger LOG = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    MovieJPARepository movieRepository;

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        LOG.info("GET /v1/movies");
       
        List<Movie> movies = movieRepository.findAll();

        return(movies.isEmpty()) ? new ResponseEntity<>(HttpStatus.NO_CONTENT) :
            new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }
    
}
