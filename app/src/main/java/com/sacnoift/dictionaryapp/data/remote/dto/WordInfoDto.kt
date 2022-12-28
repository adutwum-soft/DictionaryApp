package com.sacnoift.dictionaryapp.data.remote.dto

data class WordInfoDto(
    val license: LicenseDto,
    val meaning: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
)