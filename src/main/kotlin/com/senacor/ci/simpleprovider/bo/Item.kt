
package com.senacor.ci.simpleprovider.bo

import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.*
import javax.persistence.EnumType.STRING

/*
@MappedSuperclass
@GenericGenerator(
    name = "idSequence",
    strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
    parameters = [Parameter(name = "sequence_name", value = "ID_SEQUENCE")]
)
abstract class AbstractVersionedBO {

    @Id
    @GeneratedValue(generator = "idSequence")
    @Column(name = "ID")
    var id: Long = 0

    @Version
    @Column(name = "VERSION")
    var version: Int = 0
}
*/

@Entity
@Table(name = "items")
class Item() {

    @Id
    @GeneratedValue(generator = "idSequence")
    @Column(name = "id")
    var id: Long = 0

    @Column(name = "name")
    lateinit var name: String

    @Column(name = "price")
    lateinit var price: BigDecimal

    @Column(name = "available")
    var available: Int = 0

    constructor(
            id: Long,
            name: String,
            price: BigDecimal,
            available: Int
    ) : this() {
        this.id = id
        this.name = name
        this.price = price
        this.available = available
    }
}
