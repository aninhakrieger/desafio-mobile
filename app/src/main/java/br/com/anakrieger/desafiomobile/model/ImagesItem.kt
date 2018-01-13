package br.com.anakrieger.desafiomobile.model

import com.fasterxml.jackson.annotation.JsonProperty

data class ImagesItem(

	@field:JsonProperty("ImageTag")
	val imageTag: String? = null,

	@field:JsonProperty("Label")
	val label: String? = null,

	@field:JsonProperty("ImageUrl")
	val imageUrl: String? = null
)