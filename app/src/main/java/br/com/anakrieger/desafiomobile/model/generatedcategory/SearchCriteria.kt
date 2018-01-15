package br.com.anakrieger.desafiomobile.model.generatedcategory

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open class SearchCriteria: Serializable {

	@field:JsonProperty("OrderBy")
	val orderBy: Int? = null

	@field:JsonProperty("RealProductIdGroup")
	val realProductIdGroup: Any? = null

	@field:JsonProperty("Query")
	val query: Any? = null

	@field:JsonProperty("Size")
	val size: Int? = null

	@field:JsonProperty("ProductId")
	val productId: Any? = null

	@field:JsonProperty("Offset")
	val offset: Any? = null

	@field:JsonProperty("FacetItems")
	val facetItems: Any? = null

	@field:JsonProperty("ApiQuery")
	val apiQuery: String? = null

	@field:JsonProperty("EAN")
	val eAN: Any? = null

	@field:JsonProperty("Filter")
	val filter: Any? = null

	@field:JsonProperty("Hotsite")
	val hotsite: Any? = null

	@field:JsonProperty("SearchApi")
	val searchApi: Any? = null

	@field:JsonProperty("RealProductId")
	val realProductId: Any? = null
}