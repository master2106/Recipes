package com.example.vlad.recipes.database

data class Product(val id: Int = 0,
                   val name: String,
                   val proteins: Double,
                   val fat: Double,
                   val carbohydrates: Double,
                   val calories: Double,
                   val measureName: String,
                   val productTypeName: String
                   )