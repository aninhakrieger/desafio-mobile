package br.com.anakrieger.desafiomobile.model.generatedmodel

import br.com.anakrieger.desafiomobile.model.generatedmodel.BestInstallment
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class SellersItem(

        @field:JsonProperty("BestInstallment")
        val bestInstallment: BestInstallment? = null,

        @field:JsonProperty("Price")
        val price: Double? = null,

        @field:JsonProperty("Offer")
        val offer: Any? = null,

        @field:JsonProperty("Quantity")
        val quantity: Int? = null,

        @field:JsonProperty("Id")
        val id: String? = null,

        @field:JsonProperty("ListPrice")
        val listPrice: Double? = null,

        @field:JsonProperty("Name")
        val name: String? = null
)