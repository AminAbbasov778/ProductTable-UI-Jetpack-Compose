package com.example.app3.domain.interfaces

import com.example.app3.domain.model.ProductModel

interface ProductRepository {
    fun getProductData(): List<ProductModel>
}