package balazs.learning.crudapi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class CrudApiApplicationTests {

    @Autowired private CrudApiApplication crudApiApplication;

    @Test
    void contextLoads() throws Exception {
        assertThat(crudApiApplication).isNotNull();
    }
}
