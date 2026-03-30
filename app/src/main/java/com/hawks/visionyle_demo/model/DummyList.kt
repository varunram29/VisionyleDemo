package com.hawks.visionyle_demo.model

object DummyList {
    val categoryList: List<Category> = listOf(
        Category(
            1,
            "Pizza",
            "https://img.freepik.com/free-photo/pizza-pizza-filled-with-tomatoes-salami-olives_140725-1200.jpg?semt=ais_incoming&w=740&q=80"
        ),
        Category(
            2,
            "Ice Cream",
            "https://i.pinimg.com/736x/37/78/d7/3778d7d1be1cffaad3b35da51680218f.jpg"
        ),
        Category(
            3,
            "Pasta",
            "https://borges1896.com/app/uploads//2021/06/WW-20190422-1-1-scaled.jpeg"
        ),
        Category(
            4,
            "Snacks",
            "https://t3.ftcdn.net/jpg/11/67/94/48/360_F_1167944833_b1Bq20gYvAPovrGL3niR3EvWaZGSsnLP.jpg"
        ),
        Category(
            5,
            "Milk shakes",
            "https://static.vecteezy.com/system/resources/thumbnails/025/276/210/small/three-milkshakes-chocolate-strawberry-professional-foodgraphy-ai-generated-photo.jpg"
        ),
        Category(
            6,
            "Cool Drinks",
            "https://thumbs.dreamstime.com/b/colorful-cold-drinks-plastic-cups-beach-ice-fresh-fruits-86654557.jpg"
        )
    )

    val recommendedProductsList: List<Product> = listOf(
        Product(
            1,
            "Boiled Egg Pizza",
            1,
            700,
            "Cheese, Boiled Eggs",
            "https://img.freepik.com/free-photo/pizza-pizza-filled-with-tomatoes-salami-olives_140725-1200.jpg?semt=ais_incoming&w=740&q=80"
        ),
        Product(
            2,
            "Pineapple Pizza",
            1,
            500,
            "Pineapple, Clives",
            "https://img.freepik.com/free-photo/hawaiian-pizza-with-pineapple-ham-cheese-wooden-table_123827-22283.jpg?semt=ais_incoming&w=740&q=80"
        ),
        Product(
            3,
            "Chicken Pasta",
            3,
            500,
            "Pineapple, Clives",
            "https://borges1896.com/app/uploads//2021/06/WW-20190422-1-1-scaled.jpeg"
        )
    )

    val topFoodOrderedProductsList: List<Product> = listOf(
        Product(
            4,
            "Mango Delight",
            4,
            219,
            "Cheese, Boiled Eggs",
            "https://i0.wp.com/s.lightorangebean.com/media/20240930000916/Mango-Coconut-Delight_post3-768x482.jpg?resize=768%2C482&quality=89&ssl=1"
        ),
        Product(
            2,
            "Peri-Peri Chicken Pasta",
            3,
            500,
            "Pineapple, Clives",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSBX4_9xGElqXpZ40WN20OXFNMX16hMblltzA&s"
        ),
        Product(
            3,
            "Chicken Pasta",
            3,
            500,
            "Pineapple, Clives",
            "https://borges1896.com/app/uploads//2021/06/WW-20190422-1-1-scaled.jpeg"
        )
    )
}