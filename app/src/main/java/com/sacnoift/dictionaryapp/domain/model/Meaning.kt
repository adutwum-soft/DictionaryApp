package com.sacnoift.dictionaryapp.domain.model

import com.sacnoift.dictionaryapp.data.remote.dto.DefinitionDto

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */
data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String,
)
