package com.vicky;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class DoSomeMathsTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/doSomeMaths/2")
          .then()
             .statusCode(200)
             .body(is("4"));
    }

}