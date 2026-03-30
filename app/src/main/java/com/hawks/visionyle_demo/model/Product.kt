package com.hawks.visionyle_demo.model

class Product {
    var id: Long = 0L
    var name: String? = null
    var categoryId: Long = 0L
    var mrp: Int = 0
    var ingredients: String? = null
    var imageUrl: String? = null

    constructor()
    constructor(
        id: Long,
        name: String?,
        categoryId: Long,
        mrp: Int,
        ingredients: String?,
        imageUrl: String?
    ) {
        this.id = id
        this.name = name
        this.categoryId = categoryId
        this.mrp = mrp
        this.ingredients = ingredients
        this.imageUrl = imageUrl
    }
}