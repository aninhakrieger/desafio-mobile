package br.com.anakrieger.desafiomobile.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.anakrieger.desafiomobile.R
import br.com.anakrieger.desafiomobile.extension.getCategories

class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val list = getCategories(supportFragmentManager)

        window.attributes.windowAnimations = R.style.ActivityAnimation


    }





}
