package balazs.learning.crudapi.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class MovieTests {
    
    @Test
    void allArgsConstructorTest() {
        String title = "First";
        String overview = "Overview";
        Float popularity = 19.0f;
        Date releaseDate = new Date(1L);
        Set<Genre> genres = new HashSet<Genre>();
        Movie movie = new Movie(title, overview, popularity, releaseDate, genres);
        assertThat(movie.getTitle()).isEqualTo(title);
    }
}
