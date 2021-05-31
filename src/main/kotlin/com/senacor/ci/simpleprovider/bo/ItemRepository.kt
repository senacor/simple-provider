package com.senacor.ci.simpleprovider.bo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.time.LocalDate
import java.time.LocalDateTime

interface ItemRepository : JpaRepository<Item, Long> {
    fun findAllByNameStartsWith(name: String): Optional<List>;
}
