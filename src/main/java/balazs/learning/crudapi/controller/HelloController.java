package balazs.learning.crudapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import balazs.learning.crudapi.model.Movie;
import balazs.learning.crudapi.repo.MovieSpringDataDao;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class HelloController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    MovieSpringDataDao movies;

    @GetMapping("/")
    public Collection<Movie> home() {
        LOG.info("GET /");
        return movies.findAll();
    }
}