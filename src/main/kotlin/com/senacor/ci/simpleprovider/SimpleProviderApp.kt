package com.senacor.ci.simpleprovider

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition
import org.eclipse.microprofile.openapi.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@OpenAPIDefinition(
	info = Info(title = "Some title", description = "Some other description", version = "v0.0.1")
)
@SpringBootApplication
class SimpleProviderApp

fun main(args: Array<String>) {
	runApplication<SimpleProviderApp>(*args)
}
