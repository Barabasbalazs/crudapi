package balazs.learning.crudapi.repo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import balazs.learning.crudapi.model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class GenreJPARepositoryTests {

    @Autowired private GenreJPARepository genreJPARepository;

    private Genre genre;

    private final Movie movie =
            new Movie(
                    "My new movie",
                    "Overview",
                    Float.valueOf(18.0F),
                    LocalDate.now(),
                    new ArrayList<>());;

    @BeforeEach
    public void setup() {
        List<Movie> movies = new ArrayList<>();

        movies.add(movie);

        genre = new Genre("Added genre", movies);

        genreJPARepository.save(genre);
    }

    @AfterEach
    public void teardown() {
        genreJPARepository.delete(genre);
    }

    // find out which assert is better -> hamcrest for better logging messages
    @Test
    private void genreGetsSavedIntoRepo() {
        assertThat(genreJPARepository.findById(genre.getId()).get(), is(equalTo(genre)));
    }

    @Test
    private void movieGetsMapped() {
        assertThat(
                genreJPARepository.findById(genre.getId()).get().getMovies().contains(movie),
                is(true));
    }
}
