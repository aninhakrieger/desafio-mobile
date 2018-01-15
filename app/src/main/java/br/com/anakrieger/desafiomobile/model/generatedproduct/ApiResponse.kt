package br.com.anakrieger.desafiomobile.model.generatedproduct

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open  class ApiResponse: Serializable {

        @field:JsonProperty("ApiQuery")
        val apiQuery: String? = null

        @field:JsonProperty("Products")
        val products: ArrayList<ProductsItem?>? = null

        @field:JsonProperty("Size")
        val size: Int? = null

        @field:JsonProperty("Total")
        val total: Int? = null

        @field:JsonProperty("Delay")
        val delay: Double? = null

        @field:JsonProperty("Offset")
        val offset: Int? = null
}