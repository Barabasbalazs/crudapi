package balazs.learning.crudapi.model;

import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "genres")
public class Genre extends BaseEntity {
    @Column(nullable = false)
    String name;
    @ManyToMany(mappedBy = "genres")
    Set<Movie> movies;
}
