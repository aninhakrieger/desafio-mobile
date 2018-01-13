package br.com.anakrieger.desafiomobile.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

/**
 * Created by anakrieger on 12/01/2018.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class Category: BaseModel() {
    private val subCategory: Category? = null
    private val categoryListOrder:Int = 0
    private val categoryTreeOrder:Int = 0
    private val icon:String? = null
    private val highlight:Boolean =  false
}