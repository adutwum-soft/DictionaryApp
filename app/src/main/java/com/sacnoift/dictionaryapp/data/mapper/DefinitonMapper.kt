package com.sacnoift.dictionaryapp.data.mapper

import com.sacnoift.dictionaryapp.data.remote.dto.DefinitionDto
import com.sacnoift.dictionaryapp.domain.model.Definition

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */

fun DefinitionDto.toDefinition(): Definition{
    return Definition(
        antonyms = antonyms,
        definition = definition,
        example = example,
        synonyms = synonyms
    )
}