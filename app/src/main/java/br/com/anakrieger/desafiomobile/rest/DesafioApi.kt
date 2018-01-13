package br.com.anakrieger.desafiomobile.rest

import br.com.anakrieger.desafiomobile.model.ApiResponse
import br.com.anakrieger.desafiomobile.model.Criteria
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by anakrieger on 12/01/2018.
 */
interface DesafioApi {

    @POST("Search/Criteria")
    fun getSearch(@Body criteria: Criteria) : Call<ApiResponse>

    @GET("StorePreference/CategoryTree")
    fun getStorePreference() : Call<Any>
}