package com.sacnoift.dictionaryapp.data.mapper

import com.sacnoift.dictionaryapp.data.remote.dto.MeaningDto
import com.sacnoift.dictionaryapp.domain.model.Meaning

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */

fun MeaningDto.toMeaning(): Meaning{
    return Meaning(
        definitions = definitions.map { it.toDefinition() },
        partOfSpeech = partOfSpeech
    )
}