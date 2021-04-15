package com.senacor.ci.simpleprovider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleProviderApp

fun main(args: Array<String>) {
	runApplication<SimpleProviderApp>(*args)
}
