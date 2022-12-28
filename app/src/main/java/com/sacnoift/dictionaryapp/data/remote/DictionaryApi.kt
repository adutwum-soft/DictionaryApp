package com.sacnoift.dictionaryapp.data.remote

import com.sacnoift.dictionaryapp.data.remote.dto.WordInfoDto
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Patrick Adutwum on 28/12/2022.
 */

interface DictionaryApi {
    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word: String
    ): List<WordInfoDto>
}