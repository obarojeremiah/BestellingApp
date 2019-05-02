package com.realdolmen.bestellingapp.model

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.realdolmen.bestellingapp.R
import kotlinx.android.synthetic.main.activity_detail_product.*

class detailProduct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_product)

        countryDetail.text = intent.getStringExtra("country")
        naamDetail.text = intent.getStringExtra("name")
        priceDetial.text = intent.getStringExtra("price")
        extraDetial.text = intent.getStringExtra("info")
        imageDetail.setImageResource(intent.getIntExtra("image",DEFAULT_BUFFER_SIZE))
    }
}
