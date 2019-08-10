package com.uirestylingexample.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.uirestylingexample.Model.Pizza
import com.uirestylingexample.R
import com.uirestylingexample.ui.viewHolders.PizzaViewHolder

class PizzaListAdapter(val pizza: ArrayList<Pizza>, val clickListener: PizzaListAdapterClickListener): RecyclerView.Adapter<PizzaViewHolder>() {

    interface PizzaListAdapterClickListener {
        fun pizzaItemClicked(id: Int)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PizzaViewHolder {
        val vistaCelda = LayoutInflater.from(p0.context)
            .inflate(R.layout.list_item_card, p0, false)
        return PizzaViewHolder(vistaCelda)
    }

    override fun getItemCount(): Int {
        return pizza.size
    }

    override fun onBindViewHolder(holder: PizzaViewHolder, p1: Int) {
        holder.name.text = pizza[p1].namePizza
        holder.setPrice(pizza[p1].pricePizza, pizza[p1].getPriceText())
        holder.setImage(pizza[p1].imagePizza, 200, 200)
        holder.itemView.setOnClickListener {
            clickListener.pizzaItemClicked(p1)
        }
    }
}