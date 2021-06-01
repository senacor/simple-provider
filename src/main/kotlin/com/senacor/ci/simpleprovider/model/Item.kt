package com.senacor.ci.simpleprovider.model

import java.math.BigDecimal

@Schema(
    name = "Item",
    description = "Data Object to be returned after a search",
    oneOf = com.senacor.ci.simpleprovider.model.Item.class)
data class Item(val name: String, val price: BigDecimal, val available: Int)
