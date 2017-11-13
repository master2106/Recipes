package com.example.vlad.recipes

import android.content.Intent
import android.database.sqlite.SQLiteOpenHelper
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.vlad.recipes.database.RecipesDatabaseHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        try {
            println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
            val dbHelper: SQLiteOpenHelper = RecipesDatabaseHelper(this)
            val db = dbHelper.writableDatabase

            val cursor = db.query(false, "products_types", null, null, null, null, null, null, null)

//            cursor.moveToFirst()
            println(cursor.count)
        } catch(ex: Exception){
            val toast: Toast = Toast.makeText(this, "Database is unavailable", Toast.LENGTH_SHORT)
            toast.show()
            println(ex.message)
        }
        setContentView(R.layout.activity_main)
    }

    fun openFridge(view: View) {
        val intent = Intent(this, YourProductsActivity::class.java)

        startActivity(intent)
    }

    fun openAllRecipes(view: View) {
        val allRecipes = Intent(this, AllRecipesActivity::class.java)
        startActivity(allRecipes)
    }

    fun openDiets(view: View) {
        val allDiets = Intent(this, AllDietsActivity::class.java)
        startActivity(allDiets)
    }

    fun openFavoriteRecipes(view: View){
        val favoriteRecipes = Intent(this, FavoriteRecipesActivity::class.java)
        startActivity(favoriteRecipes)
    }

    fun openBasket(view: View){
        val basket = Intent(this, BasketActivity::class.java)
        startActivity(basket)
    }

}