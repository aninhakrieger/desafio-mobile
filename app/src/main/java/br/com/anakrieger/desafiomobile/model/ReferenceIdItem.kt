package br.com.anakrieger.desafiomobile.model

import com.fasterxml.jackson.annotation.JsonProperty

data class ReferenceIdItem(

	@field:JsonProperty("Value")
	val value: String? = null,

	@field:JsonProperty("Key")
	val key: String? = null
)