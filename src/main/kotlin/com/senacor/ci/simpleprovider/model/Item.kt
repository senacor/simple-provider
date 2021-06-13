package com.senacor.ci.simpleprovider.model
import java.math.BigDecimal
import javax.validation.constraints.NotBlank

data class Item(@NotBlank val name: String, @NotBlank val price: BigDecimal, @NotBlank val available: Int)
