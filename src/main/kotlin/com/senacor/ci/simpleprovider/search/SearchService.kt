package com.senacor.ci.simpleprovider.search

import com.senacor.ci.simpleprovider.bo.Item
import com.senacor.ci.simpleprovider.bo.ItemRepository

class SearchService(private val repo: ItemRepository) {

    fun search(name: String?): List<Item> {
        if(name === null) {
            return repo.findAll();
        }
        return repo.findAllByNameStartsWith(name)
    }
}