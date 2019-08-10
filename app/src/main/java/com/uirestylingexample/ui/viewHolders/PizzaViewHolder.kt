package com.uirestylingexample.ui.viewHolders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.uirestylingexample.ui.BitmapTransform
import kotlinx.android.synthetic.main.list_item_card.view.*

class PizzaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var name: TextView
    var desc: TextView
    var price: Float?
    var imageId: Int?
    var imageOrder: ImageView

    init{
        name = itemView.title
        price = null
        desc = itemView.desc
        imageId = null
        imageOrder = itemView.image
    }

    fun setPrice(price: Float, priceString: String){
        this.price = price
        desc.text = priceString
    }

    fun setImage(image: Int,maxWidth: Int, maxHeight: Int){
        imageId = image
        Picasso.get()
            .load(image)
            .transform(BitmapTransform(maxWidth,maxHeight))
            .into(imageOrder)
    }

}