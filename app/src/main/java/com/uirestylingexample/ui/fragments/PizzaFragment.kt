//package com.uirestylingexample.ui.fragments
//
//import android.content.Context
//import android.os.Bundle
//import androidx.fragment.app.Fragment
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//import com.uirestylingexample.R
//import com.uirestylingexample.database.FakeDatabase
//import com.uirestylingexample.ui.MainActivity
//import com.uirestylingexample.ui.adapters.PizzaListAdapter
//import kotlinx.android.synthetic.main.fragment_menu.*
//
//class PizzaFragment : Fragment(), PizzaListAdapter.PizzaListAdapterClickListener {
//
//    var fakeDatabase: FakeDatabase? = null
//
//    private var adapter: RecyclerView.Adapter<PizzaListAdapter.PizzaViewHolder>? = null
//
//    private lateinit var layoutManager: LinearLayoutManager
//
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val view = inflater.inflate(R.layout.fragment_menu, container, false)
//        fakeDatabase?.setListPizza()
//
//        return view
//    }
//
//    lateinit var mAdapter:  PizzaListAdapter
//    lateinit var mActivity: AppCompatActivity
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        mActivity = activity as MainActivity
//    }
//
//    override fun pizzaItemClicked(id: Int) {
//        context?.toast("click")
//    }
//
//
//    private fun Context.toast(message: CharSequence) =
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//
//}
//
