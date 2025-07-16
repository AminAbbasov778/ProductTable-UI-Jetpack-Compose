package com.example.app3.presentation.mapper

import com.example.app3.domain.model.ProductModel
import com.example.app3.presentation.model.ProductUi

fun ProductModel.toUi(): ProductUi {
    return ProductUi(
        category = category,
        amount = amount,
        unit = unit
    )
}