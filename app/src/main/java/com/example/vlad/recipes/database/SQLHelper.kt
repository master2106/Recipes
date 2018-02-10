package com.example.vlad.recipes.database

import android.database.sqlite.SQLiteDatabase

fun execSQLQuery(sql: String, db: SQLiteDatabase){
    db.execSQL(sql)
}