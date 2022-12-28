package com.sacnoift.dictionaryapp.data.mapper

import com.sacnoift.dictionaryapp.data.remote.dto.PhoneticDto
import com.sacnoift.dictionaryapp.domain.model.Phonetic

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */

fun PhoneticDto.toPhonetic(): Phonetic{
    return Phonetic(
        audio = audio,
        license = license,
        sourceUrl = sourceUrl,
        text = text,
    )
}