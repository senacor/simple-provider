package com.senacor.ci.simpleprovider.search

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class SearchController(val searchService: SearchService) {
    @GetMapping(path = ["items"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun search() = ok(searchService.search())
}
