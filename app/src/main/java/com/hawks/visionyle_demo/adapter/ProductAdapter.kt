package com.hawks.visionyle_demo.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hawks.visionyle_demo.R
import com.hawks.visionyle_demo.model.Product

class ProductAdapter(
    list1: List<Product>,
    val onItemClicked: (position: Int) -> Unit
) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    private val TAG = "varun ${this.javaClass.simpleName}"
    private var list: List<Product> = mutableListOf()

    init {
        list = list1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val context = holder.itemView.context
        val product = list[position]
        holder.parent.setOnClickListener {
            onItemClicked(position)
        }
        Glide.with(context)
            .load(product.imageUrl)
            .placeholder(R.drawable.no_image)
            .error(R.drawable.no_image)
            .centerCrop()
            .into(holder.imageview)

        holder.productName.text = product.name
        holder.mrp.text = "₹${product.mrp}/-"
        holder.ingredients.text = product.ingredients


    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val parent: LinearLayout = itemView.findViewById(R.id.parent)
        val imageview: ImageView = itemView.findViewById(R.id.imageview)
        val productName: TextView = itemView.findViewById(R.id.product_name)
        val mrp: TextView = itemView.findViewById(R.id.mrp)
        val ingredients: TextView = itemView.findViewById(R.id.ingredients)
    }
}