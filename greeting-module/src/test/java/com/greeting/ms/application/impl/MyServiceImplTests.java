package com.greeting.ms.application.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/** Tests class 4 MyServiceImpl */
@SpringBootTest
public class MyServiceImplTests {

  @Autowired private MyServiceImpl myService;

  @Test
  public void greetReturnMessage() {
    // given
    String expectedGreeting = "Hello, World";

    // when
    String foundGreeting = myService.greet();

    // then
    assertEquals(expectedGreeting, foundGreeting);
  }
}
