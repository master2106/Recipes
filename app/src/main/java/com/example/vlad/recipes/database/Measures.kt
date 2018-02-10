package com.example.vlad.recipes.database

import android.database.sqlite.SQLiteDatabase

fun createMeasuresTable(db: SQLiteDatabase) {
    val sql = "CREATE TABLE measures(" +
            "_id integer PRIMARY KEY AUTOINCREMENT, " +
            "name varchar (20) NOT NULL" +
            ")"
    db.execSQL(sql)
}

fun addMeasure(name: String, db: SQLiteDatabase) {
    val sql = "INSERT INTO measures(name)," +
            "VALUES ($name))"
    db.execSQL(sql)
}

fun addAllMeasures(db: SQLiteDatabase) {
    addMeasure("г", db)
    addMeasure("л.", db)
    addMeasure("ст. л.", db)
    addMeasure("ч. л.", db)
    addMeasure("кг", db)
    addMeasure("шт.", db)
    addMeasure("кусочек", db)
    addMeasure("уп.", db)
    addMeasure("ст.", db)
}