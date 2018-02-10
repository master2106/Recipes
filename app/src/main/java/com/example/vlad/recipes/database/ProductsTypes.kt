package com.example.vlad.recipes.database

import android.database.sqlite.SQLiteDatabase
import com.example.vlad.recipes.enums.ProductTypesNames


fun createProductsTypesTable(db: SQLiteDatabase) {
    val sql = "CREATE TABLE if not exists products_types (\n" +
            " _id integer PRIMARY KEY AUTOINCREMENT,\n" +
            " name text NOT NULL\n" +
            ");"
    db.execSQL(sql)

}

fun addProductsType(name: String, db: SQLiteDatabase) {
    val sql = "INSERT INTO products_types (name) " +
            "VALUES ('$name')"
    db.execSQL(sql)
}

fun addAllProductTypes(db: SQLiteDatabase) {
    val listOfNames = ProductTypesNames.values()
    for (item: ProductTypesNames in listOfNames) {
        addProductsType(item.name, db)
    }
}