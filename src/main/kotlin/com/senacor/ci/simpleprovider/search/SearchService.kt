package com.senacor.ci.simpleprovider.search

import com.senacor.ci.simpleprovider.bo.ItemRepository

class SearchService(private val repo: ItemRepository) {

    fun search(name: String) = repo.findAllByNameStartsWith(name)
}