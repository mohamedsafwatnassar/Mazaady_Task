package com.mazaady.android_task.data.api

import com.google.gson.JsonObject
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("get_all_cats")
    suspend fun getAllCategories(): Response<JsonObject?>

    @GET("properties")
    suspend fun getPropertiesCategory(
        @Query("cat") categoryId: String
    ): Response<JsonObject?>

    @GET("get-options-child")
    suspend fun getOptionsChild(
        @Query("id") childId: Int
    ): Response<JsonObject?>


}
