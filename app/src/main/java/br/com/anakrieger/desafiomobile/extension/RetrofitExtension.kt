package br.com.anakrieger.desafiomobile.extension

import br.com.anakrieger.desafiomobile.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

/**
 * Created by anakrieger on 12/01/2018.
 */

fun retrofit(): Retrofit {
    return builderRetrofit().build()
}

fun builderRetrofit(): Retrofit.Builder {
    val okHttpClient = OkHttpClient().newBuilder()
    return Retrofit
            .Builder()
            .baseUrl(BuildConfig.API_BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create())
            .client(okHttpClient.build())
}

fun <S> createRetrofit(serviceClass: Class<S>): S {
    return retrofit().create(serviceClass)
}