package com.jake.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTests {
    private final MockMvc mvc;

    public GreetingControllerTests(MockMvc mvc) {
        this.mvc = mvc;
    }


    @Test
    public void shouldReturnHello() throws Exception {
        mvc.perform(get("/api/greeting"))
            .andExpect(content().string(containsString("Hello")));
    }

}
