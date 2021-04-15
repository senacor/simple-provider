package com.senacor.ci.simpleprovider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleProviderApplication

fun main(args: Array<String>) {
	runApplication<SimpleProviderApplication>(*args)
}
