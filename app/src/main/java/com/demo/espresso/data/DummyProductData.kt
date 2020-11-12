package com.demo.espresso.data

object DummyProductData {

    const val FAKE_NETWORK_DELAY = 500L

    val products = arrayOf(
        Product(
            1,
            "Darjelling",
            "Blue Tea",
            "https://cdn.shopify.com/s/files/1/1234/1342/products/HT_Blueberry_Green_20_CT_Sachet_2019_64956b82-4b59-4c80-bda1-a075c58ec770_2000x.jpg?v=1580995123",
            850
        ),
        Product(
            2,
            "Assam",
            "Purple Tea",
            "https://cdn.shopify.com/s/files/1/1234/1342/products/Tins_20_Count_HT_Black_Currant_2000x.jpg?v=1592413305",
            750
        ),
        Product(
            3,
            "Lapsang",
            "Red Tea",
            "https://cdn.shopify.com/s/files/1/1234/1342/products/HT_Holiday_1fa7b6bd-521e-4f6c-997a-be8ed9d4856b_2000x.jpg",
            950
        ),
        Product(
            4,
            "Early Grey",
            "Grey Tea",
            "https://images-na.ssl-images-amazon.com/images/I/61sd%2BxofntL._SX522_.jpg",
            350
        ),
        Product(
            5,
            "Irish Breakfast",
            "Green Tea",
            "https://cdn.shopify.com/s/files/1/1234/1342/products/HT_Ginger_Tea.jpg?v=1564071473",
            250
        )
    )
}
