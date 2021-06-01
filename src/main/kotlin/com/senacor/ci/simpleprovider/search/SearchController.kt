package com.senacor.ci.simpleprovider.search

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Operation(
    summary = "Erstelle eine neue Suche",
    description = "Nutze diese Schnittstelle um ein Item zu suchen",
    security = @SecurityRequirement(name = "SomeOauth2Security", scopes = "write"),
    responses= {
        @ApiResponse(responseCode = "201", description = "Success"),
        @ApiResponse(responseCode = "403", description = "Forbidden"),
        @ApiResponse(responseCode = "500", description = "Server Error")
    }
)
@RestController
@CrossOrigin("*")
class SearchController(val searchService: SearchService) {
    @GetMapping(path = ["items"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun search(@RequestParam(required = false) name: String?) = ok(searchService.search(name))
}
