package com.uirestylingexample.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.uirestylingexample.R
import com.uirestylingexample.Test
import com.uirestylingexample.TestAdapter
import kotlinx.android.synthetic.main.fragment_recycler.*
import kotlinx.android.synthetic.main.fragment_recycler.view.*
import kotlinx.android.synthetic.main.fragment_recycler.view.menu_list
import kotlinx.android.synthetic.main.item_list.*
import kotlinx.android.synthetic.main.item_test.*
import kotlinx.android.synthetic.main.item_test.view.*
import kotlinx.android.synthetic.main.item_test.view.iv_image

class RecyclerFragment : Fragment() {



    private var mRecyclerView: RecyclerView? = null
//    private var mAdapter: RecyclerView.Adapter<*>? = null
    var listOftest: ArrayList<Test> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recycler, container, false)

//        itemList()
//        mRecyclerView = menu_list
//        var mLayoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
//        mRecyclerView!!.layoutManager = mLayoutManager

//        menu_list.layoutManager = LinearLayoutManager(view.context)
//        menu_list.adapter = TestAdapter()
//        mAdapter = TestAdapter(listOftest)
//        mRecyclerView!!.adapter = mAdapter


//        val adapter = ItemList()
//        view.menu_list.apply {
//            adapter = ItemList()

//            this.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false)
//        }


        return view
    }

    lateinit var mAdapter: TestAdapter
    lateinit var mContainerFragment: ContainerFragment
    var fragmentContext = view?.context

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        itemList()
//        mContainerFragment = fragmentManager as ContainerFragment
        mAdapter = TestAdapter(listOftest)
        menu_list.layoutManager = LinearLayoutManager(fragmentContext)
        menu_list.adapter = mAdapter
        mAdapter = TestAdapter(listOftest)

    }


//    fun addPizza() {
//
//    }
    fun itemList() {
        for (i in 1..50) {
            val user = Test()
            user.image = iv_image
            user.id = i
            user.login = "Test $i"
            listOftest!!.add(user)

        }
    }
}
