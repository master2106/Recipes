package com.example.vlad.recipes.database

import android.database.sqlite.SQLiteDatabase

fun createDietsTable(db: SQLiteDatabase){
    val sql = "CREATE TABLE diets(" +
            "_id integer PRIMARY KEY AUTOINCREMENT, " +
            "name varchar(50) NOT NULL," +
            "description varchar(500)" +
            ")"
    db.execSQL(sql)
}

fun addDiet(name: String, description: String, db: SQLiteDatabase){
    val sql = "INSERT INTO diets (name, description)" +
            "VALUES ('$name', '$description')"
    db.execSQL(sql)
}