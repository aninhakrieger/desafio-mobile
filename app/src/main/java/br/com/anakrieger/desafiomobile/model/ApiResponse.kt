package br.com.anakrieger.desafiomobile.model

import com.fasterxml.jackson.annotation.JsonProperty

data class ApiResponse(

	@field:JsonProperty("ApiQuery")
	val apiQuery: String? = null,

	@field:JsonProperty("Products")
	val products: List<ProductsItem?>? = null,

	@field:JsonProperty("Size")
	val size: Int? = null,

	@field:JsonProperty("Total")
	val total: Int? = null,

	@field:JsonProperty("Delay")
	val delay: Double? = null,

	@field:JsonProperty("Offset")
	val offset: Int? = null
)