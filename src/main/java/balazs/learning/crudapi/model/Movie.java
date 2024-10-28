package balazs.learning.crudapi.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "movies")
public class Movie extends BaseEntity {
    @Column(nullable = false, name = "title")
    String title;
    @Column(nullable = false, name = "overview")
    String overview;
    @Column(nullable = false, name = "popularity")
    Float popularity;
    @Column(nullable = false, name = "release_date")
    Date releaseDate;
    @ManyToMany
    @JoinTable(
        name = "genre_movies", 
        joinColumns = @JoinColumn(name = "movie_id"), 
        inverseJoinColumns = @JoinColumn(name = "genre_id"))
    Set<Genre> genres;
}
