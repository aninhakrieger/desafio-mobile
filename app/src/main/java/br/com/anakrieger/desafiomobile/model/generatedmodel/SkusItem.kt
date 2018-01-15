package br.com.anakrieger.desafiomobile.model.generatedmodel

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open class SkusItem: Serializable {

        @field:JsonProperty("Order")
        val order: Any? = null

        @field:JsonProperty("MeasurementUnit")
        val measurementUnit: String? = null

        @field:JsonProperty("UnitMultiplier")
        val unitMultiplier: Int? = null

        @field:JsonProperty("EAN")
        val eAN: String? = null

        @field:JsonProperty("ReferenceId")
        val referenceId: List<ReferenceIdItem?>? = null

        @field:JsonProperty("Sellers")
        val sellers: List<SellersItem?>? = null

        @field:JsonProperty("Images")
        val images: List<ImagesItem?>? = null

        @field:JsonProperty("Variations")
        val variations: Variations? = null

        @field:JsonProperty("SkuName")
        val skuName: String? = null

        @field:JsonProperty("Id")
        val id: String? = null

        @field:JsonProperty("ComplementName")
        val complementName: String? = null

        @field:JsonProperty("Name")
        val name: String? = null
}