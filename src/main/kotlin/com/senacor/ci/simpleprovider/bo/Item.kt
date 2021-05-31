
package com.senacor.ci.simpleprovider.bo

import java.time.LocalDate
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType.STRING
import javax.persistence.Enumerated
import javax.persistence.Table

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
@Table(name = "ITEM")
class Item() : AbstractVersionedBO() {

    @Column(name = "NAME")
    lateinit var name: String
    
    constructor(name: String,
                ) : this() {
        this.name = name
    }
}
