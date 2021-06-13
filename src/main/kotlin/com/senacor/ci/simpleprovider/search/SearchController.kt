package com.senacor.ci.simpleprovider.search

import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses


@Api(value = "Item", description = "Serching Api")
@RestController
@CrossOrigin("*")
class SearchController(val searchService: SearchService) {

    @ApiOperation(
        value = "Erstelle eine neue Suche",
        nickname = "SearchController",
        notes = "Nutze diese Schnittstelle um ein Item zu suchen")
    @ApiResponses(value = [
        ApiResponse(code = 201, message  = "Success"),
        ApiResponse(code = 403, message  = "Forbidden"),
        ApiResponse(code = 500, message  = "Server Error")])
    @GetMapping(path = ["items"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun search(@RequestParam(required = false) name: String?) = ok(searchService.search(name))
}
