package balazs.learning.crudapi.controller;

import balazs.learning.crudapi.model.Genre;
import balazs.learning.crudapi.service.GenreService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/genres")
public class GenreController {

    private static final Logger LOG = LoggerFactory.getLogger(MovieController.class);

    @Autowired GenreService genreService;

    @GetMapping
    public ResponseEntity<List<Genre>> getGenres() {
        LOG.info("GET /v1/genres");

        List<Genre> genres = genreService.getAllGenres();

        return (genres.isEmpty())
                ? new ResponseEntity<List<Genre>>(HttpStatus.NO_CONTENT)
                : new ResponseEntity<List<Genre>>(genres, HttpStatus.OK);
    }
}
