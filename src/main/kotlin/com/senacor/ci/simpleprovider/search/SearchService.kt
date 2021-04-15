package com.senacor.ci.simpleprovider.search

import com.senacor.ci.simpleprovider.model.Item
import java.math.BigDecimal

class SearchService {
    fun search() = listOf(
        Item("Screwdriver", BigDecimal(2), 4),
        Item("Gear", BigDecimal(4), 4),
        Item("Blade", BigDecimal(8), 4)
    )
}