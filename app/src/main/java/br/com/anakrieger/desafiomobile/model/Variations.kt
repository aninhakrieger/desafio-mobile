package br.com.anakrieger.desafiomobile.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Variations(

	@field:JsonProperty("Voltagem")
	val voltagem: List<String?>? = null
)