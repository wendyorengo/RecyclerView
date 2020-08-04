package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(29,"travelling",
            listOf("wendy","valary","Akoth","Ben","John","Keith","James","Opondo","Opinyo","Awuor"))
        rvNames.adapter = namesAdapter

    }

}