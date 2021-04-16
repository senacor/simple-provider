package com.senacor.ci.simpleprovider.search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
internal class SearchServiceTest {

    lateinit var subject: SearchService

    @BeforeEach
    fun setup() {
        subject = SearchService()
    }

    @Test
    fun `search without name param finds 3 items`() {
        assertNotNull(subject.search())
        assertEquals(3, subject.search().size)
    }

    @Test
    fun `search with name param finds 1 item`() {
        assertEquals(1, subject.search("screw").size)
    }
}