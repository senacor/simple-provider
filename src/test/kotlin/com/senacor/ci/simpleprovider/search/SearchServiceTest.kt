package com.senacor.ci.simpleprovider.search

import com.senacor.ci.simpleprovider.bo.Item
import com.senacor.ci.simpleprovider.bo.ItemRepository
import org.assertj.core.util.Arrays
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import java.math.BigDecimal

@ExtendWith(MockitoExtension::class)
internal class SearchServiceTest {

    @Mock
    lateinit var itemRepository: ItemRepository

    lateinit var searchService: SearchService

    @BeforeEach
    fun setup() {
        searchService = SearchService(itemRepository)
    }

    @Test
    fun `search without name param finds 3 items`() {
        Mockito.`when`(itemRepository.findAllByNameStartsWith("test")).thenReturn(listOf(Item(0, "test", BigDecimal(1), 1)))

        assertNotNull(searchService.search(""))
        assertEquals(1, searchService.search(""))
    }
}