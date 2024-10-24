package balazs.learning.crudapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

enum MovieGenre {
    WESTERN,
    SCIFI,
    HORROR
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Genre extends BaseEntity {
    MovieGenre movieGenre;
}
