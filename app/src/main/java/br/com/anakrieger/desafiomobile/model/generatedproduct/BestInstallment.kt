package br.com.anakrieger.desafiomobile.model.generatedproduct

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open class BestInstallment: Serializable {

	@field:JsonProperty("Rate")
	val rate: Int? = null

	@field:JsonProperty("Total")
	val total: Double? = null

	@field:JsonProperty("Value")
	val value: Double? = null

	@field:JsonProperty("Count")
	val count: Int? = null
}