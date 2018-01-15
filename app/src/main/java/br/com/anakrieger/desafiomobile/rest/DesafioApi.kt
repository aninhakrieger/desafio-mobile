package br.com.anakrieger.desafiomobile.rest

import br.com.anakrieger.desafiomobile.model.generatedproduct.ApiResponse
import br.com.anakrieger.desafiomobile.model.Criteria
import br.com.anakrieger.desafiomobile.model.generatedcategory.ApiCategoryResponse
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by anakrieger on 12/01/2018.
 */
interface DesafioApi {

    @POST("Search/Criteria")
    fun getSearch(@Body criteria: Criteria) : Call<ApiResponse>

    @GET("StorePreference/CategoryTree")
    fun getStorePreference(@Field("query") query: String) : Call<ApiCategoryResponse>
}