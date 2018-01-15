package br.com.anakrieger.desafiomobile.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.anakrieger.desafiomobile.R
import br.com.anakrieger.desafiomobile.adapter.CategoriesItemAdapter
import br.com.anakrieger.desafiomobile.constant.LIST_CATEGORIES_ITEM
import br.com.anakrieger.desafiomobile.extension.createCategoryView
import br.com.anakrieger.desafiomobile.model.generatedcategory.CategoriesItem

/**
 * A fragment representing a list of Items.
 */

class CategoriesItemFragment : Fragment(), CategoriesItemAdapter.CategoriesItemClickListener {

    private var listCategoriesItem: ArrayList<CategoriesItem> = arrayListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_products_item_list, container, false)
    }

    override fun onCategoriesItemClick(view: View, position: Int) {
        Log.d("ITEM", "Item $position selecionado. ")

        listCategoriesItem[position].subCategories?.let {
            activity?.supportFragmentManager?.let { fragmentManager ->
                createCategoryView(it as ArrayList<CategoriesItem?>, fragmentManager)
            }
        }

    }

    private fun populateListCategoriesItem(list: ArrayList<CategoriesItem>) {

        listCategoriesItem = arrayListOf()
        listCategoriesItem.addAll(list)


        if (!listCategoriesItem.isEmpty()) {
            listCategoriesItem.map { it ->
                Log.d("LOG", "${it.id} ${it.name}")
            }
        }

        val mRecyclerView: RecyclerView = view!!.findViewById(R.id.list_products)
        mRecyclerView.setHasFixedSize(false)

        val llm = LinearLayoutManager(activity)
        llm.orientation = LinearLayoutManager.VERTICAL
        mRecyclerView.layoutManager = llm

        val adapter = this.activity?.let { CategoriesItemAdapter(it, listCategoriesItem) }
        adapter?.setCategoriesItemClickListener(this)

        mRecyclerView.adapter = adapter

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list: ArrayList<CategoriesItem> = arrayListOf()
        this.arguments?.getSerializable(LIST_CATEGORIES_ITEM)?.let {
            list.addAll(it as ArrayList<CategoriesItem>)
        }
        populateListCategoriesItem(list)
    }


}
