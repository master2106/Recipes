package com.example.vlad.recipes.database

import android.database.sqlite.SQLiteDatabase

fun createRecipesTable(db: SQLiteDatabase) {
    val sql = "CREATE TABLE recipes(" +
            "_id integer PRIMARY KEY AUTOINCREMENT, " +
            "name varchar(100) NOT NULL," +
            "time integer," +
            "type_id integer," +
            "photo_url varchar(255)," +
            "is_favourite integer default 0," +
            "FOREIGN KEY (type_id) REFERENCES recipes_types(rowid)" +
            ")"
    db.execSQL(sql)
}

fun addRecipe(name: String, time: Int, typeId: Int, photoUrl: String, isFavourite: Int, db: SQLiteDatabase) {
    val sql = "INSERT INTO recipes(name, time, type_id, photo_url, is_favourite)" +
            "VALUES ('$name', $time, $typeId, '$photoUrl', $isFavourite)"
    db.execSQL(sql)
}