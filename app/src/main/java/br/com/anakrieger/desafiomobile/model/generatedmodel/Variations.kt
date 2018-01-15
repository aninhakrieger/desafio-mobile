package br.com.anakrieger.desafiomobile.model.generatedmodel

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open class Variations : Serializable {

	@field:JsonProperty("Voltagem")
	val voltagem: List<String?>? = null
}