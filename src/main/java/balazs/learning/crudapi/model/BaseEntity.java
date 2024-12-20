package balazs.learning.crudapi.model;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

// need this import otherwise the id will not be inherited
@MappedSuperclass
@AllArgsConstructor
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;
}
