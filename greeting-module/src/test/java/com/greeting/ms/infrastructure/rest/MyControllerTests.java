package com.greeting.ms.infrastructure.rest;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.greeting.ms.application.MyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

/** Tests class 4 MyController */
@WebMvcTest(MyController.class)
public class MyControllerTests {

  @Autowired private MockMvc mockMvc;

  @MockBean private MyService myService;

  @BeforeEach
  public void setUp() {
    when(myService.greet()).thenReturn("Hello, Mock");
  }

  @Test
  public void greetingShouldReturnMessageFromService() throws Exception {
    // given
    // when
    // then
    this.mockMvc
        .perform(get("/greeting"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("Hello, Mock")));
  }
}
