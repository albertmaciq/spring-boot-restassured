package com.greeting.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/** Main Application. */
@SpringBootApplication
public class MyApplication {

  /**
   * Main entry point.
   *
   * @param args - main arguments
   */
  public static void main(final String... args) {
    SpringApplication.run(MyApplication.class, args);
  }
}
