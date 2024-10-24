package balazs.learning.crudapi;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import balazs.learning.crudapi.controller.HelloController;

@SpringBootTest
@ActiveProfiles("test")
class CrudApiApplicationTests {

    @Autowired
   private HelloController controller;

    @Test
	void contextLoads() throws Exception {
	assertThat(controller).isNotNull();
    }

}
