package balazs.learning.crudapi.controller;

import java.util.List;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import balazs.learning.crudapi.model.Genre;
import balazs.learning.crudapi.repo.GenreJPARepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/v1/genres")
public class GenreController {

    private static final Logger LOG = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    GenreJPARepository genreRepository;

        @GetMapping
        public ResponseEntity<List<Genre>> getGenres() {
            LOG.info("GET /v1/genres");

            List<Genre> genres = genreRepository.findAll();

            return(genres.isEmpty()) ? new ResponseEntity<List<Genre>>(HttpStatus.NO_CONTENT) :
            new ResponseEntity<List<Genre>>(genres, HttpStatus.OK);
    }
    
}
