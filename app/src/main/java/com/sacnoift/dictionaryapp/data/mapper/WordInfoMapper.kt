package com.sacnoift.dictionaryapp.data.mapper

import com.sacnoift.dictionaryapp.data.remote.dto.WordInfoDto
import com.sacnoift.dictionaryapp.domain.model.WordInfo

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */

fun WordInfoDto.toWordInfo(): WordInfo{
    return WordInfo(
        license = license.toLicense(),
        meaning = meaning.map { it.toMeaning() },
        phonetic = phonetic,
        phonetics = phonetics.map { it.toPhonetic() },
        sourceUrls = sourceUrls,
        word = word
    )
}