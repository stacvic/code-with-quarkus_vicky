package com.vicky;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class DoSomeMathsTestConvert {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/doSomeMathsConvert/add")
          .then()
             .statusCode(200)
             .body(is("42"));
    }

}