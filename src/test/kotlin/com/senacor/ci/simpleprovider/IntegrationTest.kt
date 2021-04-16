package com.senacor.ci.simpleprovider

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import kotlin.annotation.AnnotationRetention.RUNTIME
import kotlin.annotation.AnnotationTarget.CLASS

@Retention(RUNTIME)
@Target(CLASS)
@SpringBootTest(webEnvironment = RANDOM_PORT)
@ContextConfiguration(classes = [SimpleProviderApp::class])
@ActiveProfiles("it")
annotation class IntegrationTest
