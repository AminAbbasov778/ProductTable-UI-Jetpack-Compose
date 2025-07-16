package com.example.app3.data.mapper

import com.example.app3.data.model.Product
import com.example.app3.domain.model.ProductModel

fun Product.toDomain(): ProductModel{
    return ProductModel(
        category = category,
        amount = amount,
        unit = unit
    )
}