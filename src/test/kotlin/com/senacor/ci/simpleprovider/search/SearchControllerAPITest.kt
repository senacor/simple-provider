package com.senacor.ci.simpleprovider.search

import com.senacor.ci.simpleprovider.IntegrationTest
import com.senacor.ci.simpleprovider.model.Item
import io.restassured.RestAssured
import io.restassured.RestAssured.given
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpStatus.OK
import java.math.BigDecimal
import org.mockito.Mockito.`when` as mockitoWhen

@IntegrationTest
internal class SearchControllerAPITest {

    @MockBean
    private lateinit var service: SearchService

    @LocalServerPort
    private var port: Int = 0

    @BeforeEach
    fun setup() {
        RestAssured.port = port
    }

    @Test
    fun `HTTP GET to resource items results in HTTP200`() {
        mockitoWhen(service.search("test")).thenReturn(listOf(Item("test", BigDecimal(1), 1)))
        given()
            .`when`()
            .param("name", "test")
            .get("items")
            .then()
            .statusCode(OK.value())
    }

}
