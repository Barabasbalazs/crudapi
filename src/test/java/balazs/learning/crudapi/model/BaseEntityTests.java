package balazs.learning.crudapi.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BaseEntityTests {

    @Test
    void setterTest() {
        BaseEntity baseEntity = new BaseEntity(1L);
        assertThat(baseEntity.getId()).isEqualTo(1L);
    }
    
}
