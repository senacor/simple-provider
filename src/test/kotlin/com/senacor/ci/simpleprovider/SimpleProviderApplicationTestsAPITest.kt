package com.senacor.ci.simpleprovider

import com.senacor.ci.simpleprovider.bo.Item
import io.restassured.RestAssured
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpStatus
import java.math.BigDecimal

//@SpringBootTest
@IntegrationTest
class SimpleProviderApplicationTestsAPITest {

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
