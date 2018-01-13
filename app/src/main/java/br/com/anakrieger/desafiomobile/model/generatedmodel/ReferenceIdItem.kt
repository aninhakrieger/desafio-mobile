package br.com.anakrieger.desafiomobile.model.generatedmodel

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ReferenceIdItem(

	@field:JsonProperty("Value")
	val value: String? = null,

	@field:JsonProperty("Key")
	val key: String? = null
)