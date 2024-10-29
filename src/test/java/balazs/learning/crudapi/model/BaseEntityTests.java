package balazs.learning.crudapi.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class BaseEntityTests {

    @Test
    void setterTest() {
        BaseEntity baseEntity = new BaseEntity(1L);
        assertThat(baseEntity.getId(), is(equalTo(1L)));
    }
}
