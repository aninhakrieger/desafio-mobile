package br.com.anakrieger.desafiomobile.model.generatedproductimport com.fasterxml.jackson.annotation.JsonIgnorePropertiesimport com.fasterxml.jackson.annotation.JsonPropertyimport java.io.Serializable@JsonIgnoreProperties(ignoreUnknown = true)open class ProductsItem: Serializable {        @field:JsonProperty("Availability")        val availability: Boolean? = null        @field:JsonProperty("Description")        val description: String? = null        @field:JsonProperty("Category")        val category: String? = null        @field:JsonProperty("Categories")        val categories: List<String?>? = null        @field:JsonProperty("Images")        val images: Any? = null        @field:JsonProperty("Variations")        val variations: List<String?>? = null        @field:JsonProperty("Name")        val name: String? = null        @field:JsonProperty("Videos")        val videos: List<String?>? = null        @field:JsonProperty("Brand")        val brand: String? = null        @field:JsonProperty("Skus")        val skus: List<SkusItem?>? = null        @field:JsonProperty("RealId")        val realId: String? = null        @field:JsonProperty("Specifications")        val specifications: Specifications? = null        @field:JsonProperty("Id")        val id: String? = null}