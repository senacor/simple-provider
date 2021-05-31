package com.senacor.ci.simpleprovider.bo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

@Repository
interface ItemRepository : JpaRepository<Item, Long> {
    fun findAllByNameStartsWith(name: String): List<Item>;
}
