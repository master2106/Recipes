package com.example.vlad.recipes.database

import android.database.sqlite.SQLiteDatabase
import com.example.vlad.recipes.enums.MeasuresNames
import com.example.vlad.recipes.enums.ProductTypesNames

fun createProductsTable(db: SQLiteDatabase) {
    val sql = "CREATE TABLE if not exists products(" +
            "_id integer PRIMARY KEY AUTOINCREMENT, " +
            "name varchar(20) NOT NULL" +
            "proteins double," +
            "fat double," +
            "carbohydrates double," +
            "calories double," +
            "measure_id integer," +
            "product_type_id integer," +
            "FOREIGN KEY (product_type_id) REFERENCES products_types(_id)," +
            "FOREIGN KEY (measures_id) REFERENCES measures(_id)" +
            ")"
    db.execSQL(sql)
}

fun addProduct(
    name: String,
    proteins: Double,
    fat: Double,
    carbohydrates: Double,
    calories: Double,
    measureName: String,
    productTypeId: Int,
    db: SQLiteDatabase
) {
    val sql =
        "INSERT INTO products(proteins, carbohydrates, calories, measure_id, product_type_id) " +
                "VALUES($name, $proteins, $carbohydrates, $calories, (Select _id from measures WHERE name = '$measureName'), $productTypeId)"
    db.execSQL(sql)
}

fun addDefaultProducts() {
    val listOfProducts = listOf(
        Product(name = "Творог 9%", proteins = 16.7, fat = 9.0, carbohydrates = 2.0, calories = 71.0, measureName = MeasuresNames.GRAM.name, productTypeName = ProductTypesNames.MILK.name),
        Product(name = "Сметана 10%", proteins = 3.0, fat = 10.0, carbohydrates = 2.9, calories = 115.0, measureName = MeasuresNames.TABLE_SPOON.name, productTypeName = ProductTypesNames.MILK.name),
        Product(name = "Сахар", proteins = 99.7, fat = 0.0, carbohydrates = 0.0, calories = 398.0, measureName = MeasuresNames.TABLE_SPOON.name, productTypeName = ProductTypesNames.SUGAR.name),
        Product(name = "Манка", proteins = 10.0, fat = 1.0, carbohydrates = 69.0, calories = 330.0, measureName = MeasuresNames.TABLE_SPOON.name, productTypeName = ProductTypesNames.CEREALS.name),
        Product(name = "Молоко 1%", proteins = 3.3, fat = 1.0, carbohydrates = 4.8, calories = 41.0, measureName = MeasuresNames.GLASS.name, productTypeName = ProductTypesNames.MILK.name),
        Product(name = "Молоко 1%", proteins = 3.3, fat = 1.0, carbohydrates = 4.8, calories = 41.0, measureName = MeasuresNames.LITRE.name, productTypeName = ProductTypesNames.MILK.name),
        Product(name = "Молоко 1%", proteins = 3.3, fat = 1.0, carbohydrates = 4.8, calories = 41.0, measureName = MeasuresNames.GRAM.name, productTypeName = ProductTypesNames.MILK.name),
        Product(name = "Сахар", proteins = 0.0, fat = 0.0, carbohydrates = 99.7, calories = 398.0, measureName = MeasuresNames.TABLE_SPOON.name, productTypeName = ProductTypesNames.SUGAR.name),
        Product(name = "Вода", proteins = 0.0, fat = 0.0, carbohydrates = 0.0, calories = 0.0, measureName = MeasuresNames.GLASS.name, productTypeName = ProductTypesNames.ALCOHOL_FREE.name),
        Product(name = "Масло сливочное 60%", proteins = 1.3, fat = 60.0, carbohydrates = 1.7, calories = 552.0, measureName = MeasuresNames.TEA_SPOON.name, productTypeName = ProductTypesNames.MILK.name),
        Product(name = "Яйцо", proteins = 12.7, fat = 10.9, carbohydrates = 0.7, calories = 157.0, measureName = MeasuresNames.UNIT.name, productTypeName = ProductTypesNames.EGGS.name),
        Product(name = "Мука", proteins = 99.7, fat = 0.0, carbohydrates = 0.0, calories = 398.0, measureName = MeasuresNames.TABLE_SPOON.name, productTypeName = ProductTypesNames.FLOUR.name),
        Product(name = "Картофель", proteins = 2.7, fat = 0.3, carbohydrates = 17.3, calories = 80.6, measureName = MeasuresNames.GRAM.name, productTypeName = ProductTypesNames.VEGETABLES.name),
        Product(name="Овсяная каша", proteins = 6.0, fat=3.4, carbohydrates = 28.4, calories = 172.0, measureName = MeasuresNames.GRAM.name, productTypeName = ProductTypesNames.CEREALS.name ),
        Product(name = "Морковь", proteins = 21.2, fat = 0.2, carbohydrates = 8.3, calories = 80.6, measureName = MeasuresNames.GRAM.name, productTypeName = ProductTypesNames.VEGETABLES.name)
    )

}