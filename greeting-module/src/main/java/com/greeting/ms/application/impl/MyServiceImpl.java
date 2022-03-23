package com.greeting.ms.application.impl;

import com.greeting.ms.application.MyService;
import org.springframework.stereotype.Service;

/** ServiceImpl class used by Controller MyController.java. */
@Service
public class MyServiceImpl implements MyService {

  /**
   * greet method.
   *
   * @return - String
   */
  public String greet() {
    return "Hello World!";
  }
}
