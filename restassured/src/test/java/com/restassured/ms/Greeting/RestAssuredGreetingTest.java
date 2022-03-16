package com.restassured.ms.Greeting;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import org.junit.jupiter.api.Assertions;

public class RestAssuredGreetingTest {

    @Test
    public void given_request_with_restassured_when_call_greeting_endpoint_then_Ok() {
        // given
        String expectedGreeting = "Hello World!";

        // when
        String foundGreeting = given()
                .post("https://spring-boot-restassured.52.209.128.30.nip.io/",expectedGreeting)
                .then()
                .extract()
                .body()
                .asString();

        // then
        Assertions.assertEquals(expectedGreeting,foundGreeting);
    }
}
