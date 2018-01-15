package br.com.anakrieger.desafiomobile.model.generatedproduct

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open class Variations : Serializable {

	@field:JsonProperty("Voltagem")
	val voltagem: List<String?>? = null
}