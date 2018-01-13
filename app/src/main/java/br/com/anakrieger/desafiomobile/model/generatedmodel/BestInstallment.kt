package br.com.anakrieger.desafiomobile.model.generatedmodel

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
@JsonIgnoreProperties(ignoreUnknown = true)
data class BestInstallment(

	@field:JsonProperty("Rate")
	val rate: Int? = null,

	@field:JsonProperty("Total")
	val total: Double? = null,

	@field:JsonProperty("Value")
	val value: Double? = null,

	@field:JsonProperty("Count")
	val count: Int? = null
)