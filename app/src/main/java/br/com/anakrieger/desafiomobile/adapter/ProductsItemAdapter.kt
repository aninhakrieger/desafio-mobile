package br.com.anakrieger.desafiomobile.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import br.com.anakrieger.desafiomobile.R
import br.com.anakrieger.desafiomobile.model.generatedmodel.ProductsItem

class ProductsItemAdapter(mContext: Context, data: ArrayList<ProductsItem>) : RecyclerView.Adapter<ProductsItemAdapter.ViewHolder>() {

    private var mLayoutInflater: LayoutInflater? = null
    private var listProductsItem: ArrayList<ProductsItem> = data
    private var mProductsItemClickListener: ProductsItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = mLayoutInflater!!.inflate(R.layout.fragment_products_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(myViewHolder: ViewHolder, position: Int) {
        val productItem: ProductsItem = listProductsItem[position]
        myViewHolder.id?.text = productItem.id
        myViewHolder.name?.text = productItem.name
    }

    override fun getItemCount(): Int {
        return listProductsItem.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var id: TextView? = null
        var name: TextView? = null
        var btnProducts: Button? = null

        init {
            id = itemView.findViewById(R.id.product_id)
            id = itemView.findViewById(R.id.product_name)

            val btn = itemView.findViewById<Button>(R.id.product_btn)
            btn.setOnClickListener(this)
            btnProducts = btn
        }

        override fun onClick(view: View) {
            if (mProductsItemClickListener != null) {
                val listener = mProductsItemClickListener!!
                listener.onProductsItemClick(view, adapterPosition)
                mProductsItemClickListener = listener
            }
        }
    }

    fun setProductsItemClickListener(productsItemClickListener: ProductsItemClickListener) {
        this.mProductsItemClickListener = productsItemClickListener
    }

    interface ProductsItemClickListener {
        fun onProductsItemClick(view: View, position: Int)
    }

    init {
        this.mLayoutInflater = LayoutInflater.from(mContext)
    }

}
