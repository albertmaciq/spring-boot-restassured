package com.greeting.ms.infrastructure.rest;

import com.greeting.ms.application.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** Controller class which receives requests to root endpoint. */
@RestController
@RequiredArgsConstructor
public class MyController {

  /** Service used 4 greeting. */
  private final MyService service;

  /**
   * root endpoint point method.
   *
   * @return - String
   */
  @GetMapping("/greeting")
  public String greeting() {
    return service.greet();
  }
}
