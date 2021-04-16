package com.senacor.ci.simpleprovider

import com.senacor.ci.simpleprovider.search.SearchService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ServiceConfiguration {

    @Bean
    fun searchService() = SearchService()
}