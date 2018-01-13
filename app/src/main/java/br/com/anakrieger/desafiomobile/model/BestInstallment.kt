package br.com.anakrieger.desafiomobile.model

import com.fasterxml.jackson.annotation.JsonProperty

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