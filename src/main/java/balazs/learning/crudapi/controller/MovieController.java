package balazs.learning.crudapi.controller;

import balazs.learning.crudapi.model.Movie;
import balazs.learning.crudapi.service.MovieService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    private static final Logger LOG = LoggerFactory.getLogger(MovieController.class);

    @Autowired MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        LOG.info("GET /v1/movies");

        List<Movie> movies = movieService.getAllMovies();

        return (movies.isEmpty())
                ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
                : new ResponseEntity<List<Movie>>(movies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable("id") Long movieId) {
        LOG.info("GET /v1/movies/" + movieId);

        Optional<Movie> searchedMovie = movieService.getMovieById(movieId);

        return searchedMovie.isPresent()
                ? new ResponseEntity<Movie>(searchedMovie.get(), HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
