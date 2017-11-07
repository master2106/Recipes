package com.example.vlad.recipes.database

import android.content.Context
import android.database.DatabaseErrorHandler
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class RecipesDatabaseHelper : SQLiteOpenHelper {

    constructor(context: Context) : super(context, DB_NAME, null, DB_VERSION) {
        
    }

    constructor(context: Context, name: String, factory: SQLiteDatabase.CursorFactory, version: Int) : super(context, name, factory, version) {}

    constructor(context: Context, name: String, factory: SQLiteDatabase.CursorFactory, version: Int, errorHandler: DatabaseErrorHandler) : super(context, name, factory, version, errorHandler) {}

    override fun onCreate(sqLiteDatabase: SQLiteDatabase) {

    }

    override fun onUpgrade(sqLiteDatabase: SQLiteDatabase, i: Int, i1: Int) {

    }

    companion object {
        private val DB_NAME = "recipes"
        private val DB_VERSION = 1
    }
}
