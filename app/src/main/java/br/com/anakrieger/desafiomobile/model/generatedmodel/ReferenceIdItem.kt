package br.com.anakrieger.desafiomobile.model.generatedmodel

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open class ReferenceIdItem: Serializable {

	@field:JsonProperty("Value")
	val value: String? = null

	@field:JsonProperty("Key")
	val key: String? = null
}