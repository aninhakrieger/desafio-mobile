package br.com.anakrieger.desafiomobile.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.anakrieger.desafiomobile.R
import br.com.anakrieger.desafiomobile.adapter.ProductsItemAdapter
import br.com.anakrieger.desafiomobile.constant.LIST_PRODUCTS_ITEM
import br.com.anakrieger.desafiomobile.model.generatedproduct.ProductsItem

class ProductsItemFragment : Fragment(), ProductsItemAdapter.ProductsItemClickListener {

    private var listProductsItem: ArrayList<ProductsItem> = arrayListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_products_item_list, container, false)
    }



    override fun onProductsItemClick(view: View, position: Int) {
        Log.d("ITEM", "Item $position selecionado. ")
    }

    private fun populateListProductsItem(list: ArrayList<ProductsItem>) {

        listProductsItem = arrayListOf()
        listProductsItem.addAll(list)


        if (!listProductsItem.isEmpty()) {
            listProductsItem.map { it ->
                Log.d("LOG", "${it.id} ${it.name}" )
            }
        }

        val mRecyclerView: RecyclerView = view!!.findViewById(R.id.list_products)
        mRecyclerView.setHasFixedSize(false)

        val llm = GridLayoutManager(activity,2)
        llm.orientation = LinearLayoutManager.VERTICAL
        mRecyclerView.layoutManager = llm

        val adapter = this.activity?.let { ProductsItemAdapter(it, listProductsItem) }
        adapter?.setProductsItemClickListener(this@ProductsItemFragment)

        mRecyclerView.adapter = adapter

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list: ArrayList<ProductsItem> = arrayListOf()
        this.arguments?.getSerializable(LIST_PRODUCTS_ITEM)?.let {
            list.addAll(it as ArrayList<ProductsItem>)
        }
        populateListProductsItem(list)
    }

}
