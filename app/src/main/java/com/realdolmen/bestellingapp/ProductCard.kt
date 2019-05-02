package com.realdolmen.bestellingapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.realdolmen.bestellingapp.data.ProductAdapter
import com.realdolmen.bestellingapp.model.Bestelling2
import com.realdolmen.bestellingapp.model.ListCardItems
import kotlinx.android.synthetic.main.activity_product_card.*

class ProductCard : AppCompatActivity() {


    private var adapter: ProductAdapter? = null
    private var mealListCrds: ArrayList<ListCardItems>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_card)
        mealListCrds = ArrayList<ListCardItems>()
        layoutManager = LinearLayoutManager(this)
        adapter = ProductAdapter(mealListCrds!!, this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        var imageIdList = arrayOf<Int>(
            R.drawable.chocolate,
            R.drawable.carre,
            R.drawable.thumb_wafels


        )
        var typeWaffelsList: Array<String> = arrayOf(
            "Chocolate",
            "square jam",
            "waffels"

        )
        var prijsWaffels: Array<String> = arrayOf(
            "2.30", "2.50","2.00"
        )
        var infoWaffels: Array<String> = arrayOf(
            "Brussels Waffle is the best waffle that you can find in Brussels, in every bistro, treinstation. it is always hot and delicious",
            "Brussels Waffle is the best waffle that you can find in Brussels, in every bistro, treinstation. it is always hot and delicious. with nutella",
            "Lieges Waffle is the best waffle that you can find in Liege, in every bistro, treinstation. it is always hot and delicious"


        )
        var CountryWaffelsList: Array<String> = arrayOf(
            "Belgium",
            "Belgium",
            "Belgium"
        )

        for (i in 0..2) {
            var waffel = ListCardItems()
            waffel.type = typeWaffelsList[i]
            waffel.price = prijsWaffels[i]
            waffel.img = imageIdList[i]
            waffel.origin=infoWaffels[i]
           // waffel.originWaffles = CountryWaffelsList[i]

            mealListCrds?.add(waffel)
        }
        adapter!!.notifyDataSetChanged()

        recyclerView.setOnClickListener { }
    }

    fun toOrderPage(view : View){
        val intent = Intent(this, Bestelling2::class.java)
        intent.action = Intent.ACTION_SEND
        //intent.putExtra(Intent.EXTRA_TEXT, "Welcome to the second activity" );
        startActivity(intent)

    }




}
