package com.sacnoift.dictionaryapp.domain.model

import com.sacnoift.dictionaryapp.data.remote.dto.LicenseDto

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */
data class WordInfo(
 val license: License,
 val meaning: List<Meaning>,
 val phonetic: String,
 val phonetics: List<Phonetic>,
 val sourceUrls: List<String>,
 val word: String
)
