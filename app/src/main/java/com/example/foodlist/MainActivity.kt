package com.example.foodlist

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/*
* This app implements recyclerview
*/

class MainActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.rv_food)
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val adapter = ListAdapter(list)
        rvFood.adapter = adapter
    }

    private fun showRecyclerGrid() {
        rvFood.layoutManager = GridLayoutManager(this, 2)
        val gridAdapter = GridAdapter(list)
        rvFood.adapter = gridAdapter
    }

    private fun showRecyclerCardView() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val cardViewAdapter = CardViewAdapter(list)
        rvFood.adapter = cardViewAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }

            R.id.action_grid -> {
                showRecyclerGrid()
            }

            R.id.action_cardview -> {
                showRecyclerCardView()
            }

        }
    }

}


