package br.com.anakrieger.desafiomobile.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * Created by anakrieger on 13/01/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class Product : BaseModel() {
    private val brand: String = ""
    private val description: String = ""
    private val specifications: String = ""
}