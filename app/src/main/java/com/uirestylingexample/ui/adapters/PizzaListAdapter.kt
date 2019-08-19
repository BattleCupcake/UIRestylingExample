//package com.uirestylingexample.ui.adapters
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.squareup.picasso.Picasso
//import com.uirestylingexample.Model.Pizza
//import com.uirestylingexample.R
//import com.uirestylingexample.ui.BitmapTransform
//import kotlinx.android.synthetic.main.list_item_card.view.*
//
//class PizzaListAdapter(val pizza: ArrayList<Pizza>, val clickListener: PizzaListAdapterClickListener): RecyclerView.Adapter<PizzaListAdapter.PizzaViewHolder>() {
//
//
//
//
//    interface PizzaListAdapterClickListener {
//        fun pizzaItemClicked(id: Int)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, position: Int): PizzaViewHolder {
//        val view = LayoutInflater.from(parent.context)
//            .inflate(R.layout.list_item_card, parent, false)
//        return PizzaViewHolder(view)
//    }
//
//    override fun getItemCount(): Int {
//        return pizza.size
//    }
//
//    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) {
//        holder.name.text = pizza[position].namePizza
//        holder.setPrice(pizza[position].pricePizza, pizza[position].getPriceText())
//        holder.setImage(pizza[position].imagePizza, 200, 200)
//        holder.itemView.setOnClickListener {
//            clickListener.pizzaItemClicked(position)
//        }
//    }
//
//    class PizzaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//        var name: TextView
//        var desc: TextView
//        var price: Float?
//        var imageId: Int?
//        var imageOrder: ImageView
//
//        init{
//            name = itemView.title
//            price = null
//            desc = itemView.desc
//            imageId = null
//            imageOrder = itemView.image
//        }
//
//        fun setPrice(price: Float, priceString: String){
//            this.price = price
//            desc.text = priceString
//        }
//
//        fun setImage(image: Int, maxWidth: Int, maxHeight: Int){
//            imageId = image
//            Picasso.get()
//                .load(image)
//                .transform(BitmapTransform(maxWidth,maxHeight))
//                .into(imageOrder)
//        }
//
//    }
//}