package balazs.learning.crudapi.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MovieTests {
    
    @Test
    void allArgsConstructorTest() {
        String title = "First";
        String overview = "Overview";
        Float popularity = 19.0f;
        LocalDate releaseDate = LocalDate.now();
        List<Genre> genres = new ArrayList<Genre>();
        Movie movie = new Movie(title, overview, popularity, releaseDate, genres);
        assertThat(movie.getTitle()).isEqualTo(title);
    }
}
