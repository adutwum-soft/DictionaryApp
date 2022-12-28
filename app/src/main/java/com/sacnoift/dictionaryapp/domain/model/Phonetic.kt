package com.sacnoift.dictionaryapp.domain.model

import com.sacnoift.dictionaryapp.data.remote.dto.LicenseDto

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */
data class Phonetic(
 val audio: String,
 val license: LicenseDto,
 val sourceUrl: String,
 val text: String
)
