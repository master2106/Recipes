package com.example.vlad.recipes.database

import android.content.ContentValues
import android.content.Context
import android.database.DatabaseErrorHandler
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class RecipesDatabaseHelper : SQLiteOpenHelper {

    constructor(context: Context) : super(context, DB_NAME, null, DB_VERSION) {

    }

    constructor(context: Context, name: String, factory: SQLiteDatabase.CursorFactory, version: Int) : super(context, name, factory, version) {}

    constructor(context: Context, name: String, factory: SQLiteDatabase.CursorFactory, version: Int, errorHandler: DatabaseErrorHandler) : super(context, name, factory, version, errorHandler) {}

    override fun onCreate(db: SQLiteDatabase) {
        val sql = "CREATE TABLE products_types (\n" +
                " _id integer PRIMARY KEY AUTOINCREMENT,\n" +
                " name text NOT NULL\n" +
                ");"
        db.execSQL(sql)
        insertProductType(db, "Vegetable")
    }

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, i: Int, i1: Int) {

    }

    fun insertProductType(db: SQLiteDatabase, name: String) {
//        val productsTypesValues = ContentValues()
//        productsTypesValues.put("_id", 1)
//        productsTypesValues.put("name", name)
//        db.insert("products_types", null, productsTypesValues)
        val sql = "INSERT INTO products_types (\n" +
                "  name)" +
                "VALUES('" + name + "');"
        db.execSQL(sql)
    }

    companion object {
        private val DB_NAME = "recipes"
        private val DB_VERSION = 2
    }
}
