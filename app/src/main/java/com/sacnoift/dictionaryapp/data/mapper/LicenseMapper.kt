package com.sacnoift.dictionaryapp.data.mapper

import com.sacnoift.dictionaryapp.data.remote.dto.LicenseDto
import com.sacnoift.dictionaryapp.domain.model.License

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */

fun LicenseDto.toLicense(): License{
    return License(
        name = name,
        url = url,
    )
}