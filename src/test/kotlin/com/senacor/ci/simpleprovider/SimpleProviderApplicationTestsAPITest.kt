package com.senacor.ci.simpleprovider

import io.restassured.RestAssured
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpStatus

//@SpringBootTest
@IntegrationTest
class SimpleProviderApplicationTestsAPITest {

  @LocalServerPort
  private var port: Int = 0

  @BeforeEach
  fun setup() {
    RestAssured.port = port
  }

	@Test
	fun `HTTP GET to resource items results in HTTP200`() {
		RestAssured.given()
				.`when`()
				.param("name", "test")
				.get("items")
				.then()
				.statusCode(HttpStatus.OK.value())
	}
}
