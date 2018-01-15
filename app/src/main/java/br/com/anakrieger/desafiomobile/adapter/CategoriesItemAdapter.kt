package br.com.anakrieger.desafiomobile.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.com.anakrieger.desafiomobile.R
import br.com.anakrieger.desafiomobile.model.generatedcategory.CategoriesItem

/**
 * Created by anakrieger on 15/01/2018.
 */
class CategoriesItemAdapter(mContext: Context, data: ArrayList<CategoriesItem>) : RecyclerView.Adapter<CategoriesItemAdapter.ViewHolder>() {

    private var mLayoutInflater: LayoutInflater? = null
    private var listCategoriesItem: ArrayList<CategoriesItem> = data
    private var mCategoriesItemClickListener: CategoriesItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = mLayoutInflater!!.inflate(R.layout.fragment_categories_item, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(myViewHolder: ViewHolder, position: Int) {
        val categoriesItem: CategoriesItem = listCategoriesItem[position]
        categoriesItem?.let { categoriesItem ->
            myViewHolder.name?.text = categoriesItem.name
        }
    }

    override fun getItemCount(): Int {
        return listCategoriesItem.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var name: TextView? = null

        init {

            val nameT: TextView? = itemView.findViewById(R.id.category_name)

            nameT?.setOnClickListener(this)
            name = nameT
        }

        override fun onClick(view: View) {
            if (mCategoriesItemClickListener != null) {
                val listener = mCategoriesItemClickListener!!
                listener.onCategoriesItemClick(view, adapterPosition)
                mCategoriesItemClickListener = listener
            }
        }
    }

    fun setCategoriesItemClickListener(CategoriesItemClickListener: CategoriesItemClickListener) {
        this.mCategoriesItemClickListener = CategoriesItemClickListener
    }

    interface CategoriesItemClickListener {
        fun onCategoriesItemClick(view: View, position: Int)
    }

    init {
        this.mLayoutInflater = LayoutInflater.from(mContext)
    }


}
