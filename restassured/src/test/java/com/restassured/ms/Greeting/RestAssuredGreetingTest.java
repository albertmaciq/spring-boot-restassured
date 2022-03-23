package com.restassured.ms.Greeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredGreetingTest {

    @Test
    public void given_request_with_restassured_when_call_greeting_endpoint_then_Ok() {
        // given
        String expectedGreeting = "Hello World!";
        int numRequest = 200;
        boolean obtained = false;
        String foundGreeting = "";

        // when
        while (numRequest != 0 && !obtained) {
            try {
                foundGreeting = given()
                        .relaxedHTTPSValidation()
                        .get("https://spring-boot-restassured.52.209.128.30.nip.io/greeting")
                        .asString();
                if (foundGreeting != "") {
                    obtained = true;
                }
            } catch (Exception ex) {
                numRequest--;
            }
        }

        // then
        Assertions.assertEquals(expectedGreeting,foundGreeting);
    }
}
