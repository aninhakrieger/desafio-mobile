package br.com.anakrieger.desafiomobile.model.generatedmodel

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

@JsonIgnoreProperties(ignoreUnknown = true)
open class Specifications: Serializable {

	@field:JsonProperty("Itens Inclusos")
	val itensInclusos: List<String?>? = null

	@field:JsonProperty("Peso e Dimensões")
	val pesoEDimensEs: List<String?>? = null

	@field:JsonProperty("Outros Detalhes")
	val outrosDetalhes: List<String?>? = null

	@field:JsonProperty("Assistência Técnica")
	val assistNciaTCnica: List<String?>? = null

	@field:JsonProperty("Garantia do Fabricante")
	val garantiaDoFabricante: List<String?>? = null

	@field:JsonProperty("mobileImages")
	val mobileImages: List<String?>? = null

	@field:JsonProperty("Texto complementação - SEO")
	val textoComplementaOSEO: List<String?>? = null

	@field:JsonProperty("Instagram")
	val instagram: List<String?>? = null

	@field:JsonProperty("Potência")
	val potNcia: List<String?>? = null

	@field:JsonProperty("Composição")
	val composiO: List<String?>? = null
}