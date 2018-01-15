package br.com.anakrieger.desafiomobile.model.generatedcategory

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open  class SubCategoriesItem: Serializable {

	@field:JsonProperty("Highlight")
	val highlight: Boolean? = null

	@field:JsonProperty("CategoryTreeOrder")
	val categoryTreeOrder: Int? = null

	@field:JsonProperty("Id")
	val id: Int? = null

	@field:JsonProperty("Redirect")
	val redirect: Redirect? = null

	@field:JsonProperty("Icon")
	val icon: Any? = null

	@field:JsonProperty("Image")
	val image: Any? = null

	@field:JsonProperty("SubCategories")
	val subCategories: Any? = null

	@field:JsonProperty("CategoryListOrder")
	val categoryListOrder: Int? = null

	@field:JsonProperty("LinkId")
	val linkId: Int? = null

	@field:JsonProperty("Name")
	val name: String? = null
}