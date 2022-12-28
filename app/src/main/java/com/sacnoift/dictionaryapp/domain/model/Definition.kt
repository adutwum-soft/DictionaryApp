package com.sacnoift.dictionaryapp.domain.model

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */
data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>
)
