package br.com.anakrieger.desafiomobile.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * Created by anakrieger on 13/01/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
open class BaseModel(
    private val id :Int = 0,
    private val Name : String = "",
    private val image: String = ""
)