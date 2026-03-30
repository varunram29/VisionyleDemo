package com.hawks.visionyle_demo.model

class Category {
    var id: Long = 0L
    var name: String? = null
    var imageUrl: String? = null

    constructor()
    constructor(id: Long, name: String?, imageUrl: String?) {
        this.id = id
        this.name = name
        this.imageUrl = imageUrl
    }


}