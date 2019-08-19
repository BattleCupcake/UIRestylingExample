package com.uirestylingexample

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list.view.*
import kotlinx.android.synthetic.main.item_test.view.*

class TestAdapter (private val mDataList: ArrayList<Test>) : RecyclerView.Adapter<TestAdapter.MyViewHolder>() {

//    private lateinit var items: List<Test>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mDataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = mDataList.get(position)
        holder.bind(item)

//        holder.tv_login.text = mDataList[position].login
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Test) {
            itemView.tv_test.text = item.toString()
            var iv_image: ImageView
            iv_image = itemView.findViewById<View>(R.id.iv_image) as ImageView

//            Picasso.get().load(item.id).into(itemView.iv_image)
        }
//        internal var tv_login: TextView
//        internal var iv_image: ImageView
//
//
//
//        init {
//            tv_login = itemView.findViewById<View>(R.id.tv_test) as TextView
//            iv_image = itemView.findViewById<View>(R.id.iv_image) as ImageView
//
//        }
    }

}