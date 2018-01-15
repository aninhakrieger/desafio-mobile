package br.com.anakrieger.desafiomobile.model.generatedcategory

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open class ApiCategoryResponse: Serializable {

	@field:JsonProperty("Categories")
	val categories: ArrayList<CategoriesItem?>? = null

	@field:JsonProperty("Id")
	val id: Int? = null
}