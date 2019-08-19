package com.uirestylingexample.Model

import android.os.Parcel
import android.os.Parcelable

//class Pizza constructor(val namePizza: String?, val pricePizza: Float, val imagePizza: Int) :
//
//    Parcelable {
//
//        constructor(source: Parcel): this(
//        source.readString(),
//        source.readFloat(),
//        source.readInt()
//        )
//
//        fun getPriceText(): String{
//            return if (pricePizza == pricePizza.toInt().toFloat()) {
//                "${pricePizza.toInt()} \u20BD"
//            } else{
//                "$pricePizza \u20BD"
//            }
//        }
//
//        override fun writeToParcel(dest: Parcel, flags: Int) {
//            dest.writeString(namePizza)
//            dest.writeFloat(pricePizza)
//            dest.writeInt(imagePizza)
//        }
//
//        override fun describeContents(): Int {
//            return 0
//        }
//
//        companion object CREATOR: Parcelable.Creator<Pizza>{
//            override fun createFromParcel(source: Parcel?): Pizza {
//                return Pizza(source!!)
//            }
//
//            override fun newArray(size: Int): Array<Pizza?> {
//                return arrayOfNulls(size)
//            }
//        }
//}