package br.com.anakrieger.desafiomobile.extension

import android.content.Context
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.util.Log
import android.widget.ImageView
import br.com.anakrieger.desafiomobile.R
import br.com.anakrieger.desafiomobile.constant.LIST_PRODUCTS_ITEM
import br.com.anakrieger.desafiomobile.fragment.ProductsItemFragment
import br.com.anakrieger.desafiomobile.model.Criteria
import br.com.anakrieger.desafiomobile.model.generatedmodel.ApiResponse
import br.com.anakrieger.desafiomobile.model.generatedmodel.ProductsItem
import br.com.anakrieger.desafiomobile.rest.DesafioApi
import br.com.anakrieger.desafiomobile.rest.createRetrofit
import com.squareup.picasso.Picasso
import com.squareup.picasso.Transformation
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.math.BigDecimal

/**
 * Created by anakrieger on 14/01/2018.
 */
fun getProducts(fragmentManager: FragmentManager): ArrayList<ProductsItem?>? {
    val criteria = Criteria()
    var listOfProducts: ArrayList<ProductsItem?>? = null

    val desafioApiInterface = createRetrofit(DesafioApi::class.java)
    desafioApiInterface.getSearch(criteria = criteria).enqueue(object : Callback<ApiResponse> {
        override fun onResponse(call: Call<ApiResponse>?, response: Response<ApiResponse>?) {
            response?.let { res ->
                val apiResponse = res.body()
                when (res.code()) {
                    200 -> {
                        apiResponse?.products?.let {
                            listOfProducts = it
                            listOfProducts?.map { productsItem ->
                                Log.d("Produto", productsItem?.name)
                            }
                            createHomeView(it,fragmentManager)
                        }
                    }
                }

                Log.d("Success", "$res")
            }
        }

        override fun onFailure(call: Call<ApiResponse>?, t: Throwable?) {
            Log.i("ERROR", "$t")
        }

    })
    return listOfProducts
}


fun createHomeView(listProductsItem: ArrayList<ProductsItem?>?, fragmentManager: FragmentManager ) {
    val fragmentTransaction = fragmentManager.beginTransaction()

    val arguments = Bundle()
    arguments.putSerializable(LIST_PRODUCTS_ITEM, listProductsItem)

    val productsItemFragment = ProductsItemFragment()
    productsItemFragment.arguments = arguments

    fragmentTransaction.replace(R.id.search_edit_frame, productsItemFragment)
    fragmentTransaction.commitAllowingStateLoss()
}

fun getDiscount(price: Double, listPrice: Double): Int {
    val bdPrice: BigDecimal = BigDecimal.valueOf(price)
    val bdListPrice: BigDecimal = BigDecimal.valueOf(listPrice)

    val div = bdPrice.div(other = bdListPrice)

    val discount: BigDecimal = BigDecimal(1).minus(div)

    return discount.multiply(BigDecimal.valueOf(100)).setScale(0, BigDecimal.ROUND_HALF_UP).toInt()
}


fun loadPicture(view: ImageView, context: Context, url: String, transformation: Transformation, drawable: Int){
    Picasso.with(context)
            .load(url)
            .placeholder(drawable)
            .transform(transformation)
            .fit()
            .centerInside()
            .into(view)
}

