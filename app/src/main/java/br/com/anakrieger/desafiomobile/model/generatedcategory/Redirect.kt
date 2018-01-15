package br.com.anakrieger.desafiomobile.model.generatedcategory

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open class Redirect: Serializable {

	@field:JsonProperty("Type")
	val type: Int? = null

	@field:JsonProperty("Title")
	val title: String? = null

	@field:JsonProperty("Id")
	val id: Int? = null

	@field:JsonProperty("SearchCriteria")
	val searchCriteria: SearchCriteria? = null
}