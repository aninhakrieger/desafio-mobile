package br.com.anakrieger.desafiomobile.model.generatedmodel

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ImagesItem(

	@field:JsonProperty("ImageTag")
	val imageTag: String? = null,

	@field:JsonProperty("Label")
	val label: String? = null,

	@field:JsonProperty("ImageUrl")
	val imageUrl: String? = null
)