package balazs.learning.crudapi.repo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.lang.Float;

import balazs.learning.crudapi.model.*;

@DataJpaTest
class GenreJPARepositoryTests {

    @Autowired
    private GenreJPARepository genreJPARepository;

    private Genre genre;

    private Movie movie = new Movie("My new movie","Overview", Float.valueOf(18.0F), LocalDate.now(), new ArrayList<>());;

    @BeforeEach
    public void setup() {
       List<Movie> movies = new ArrayList<Movie>();

        movies.add(movie);

        genre = new Genre("Added genre", movies);

        genreJPARepository.save(genre);
    }

    //add teardown

    //find out which assert is better
    @Test
    public void genreGetsSavedIntoRepo() {
        assertThat(genreJPARepository.findById(genre.getId()).get(), is(equalTo(genre)));
    }

    @Test
    public void movieGetsMapped() {
        assertTrue(genreJPARepository.findById(genre.getId()).get().getMovies().contains(movie));
    }
}
