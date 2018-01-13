package br.com.anakrieger.desafiomobile.activity

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import br.com.anakrieger.desafiomobile.R
import br.com.anakrieger.desafiomobile.model.generatedmodel.ApiResponse
import br.com.anakrieger.desafiomobile.model.Criteria
import br.com.anakrieger.desafiomobile.rest.DesafioApi
import br.com.anakrieger.desafiomobile.rest.createRetrofit
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        val criteria = Criteria()

        val desafioApiInterface = createRetrofit(DesafioApi::class.java)
        desafioApiInterface?.getSearch(criteria = criteria).enqueue(object : Callback<ApiResponse> {
            override fun onResponse(call: Call<ApiResponse>?, response: Response<ApiResponse>?) {
                response?.let { res ->

                    Log.i("Success", "$res")
                }
            }

            override fun onFailure(call: Call<ApiResponse>?, t: Throwable?) {
                Log.i("ERROR", "$t")
            }

        })
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}


