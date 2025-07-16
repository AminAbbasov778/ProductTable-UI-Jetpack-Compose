package com.example.app3.data.repository

import com.example.app3.data.mapper.toDomain
import com.example.app3.data.model.Product
import com.example.app3.domain.interfaces.ProductRepository
import com.example.app3.domain.model.ProductModel
import kotlinx.serialization.builtins.ArraySerializer

class ProductRepositoryImpl : ProductRepository {


    override fun getProductData(): List<ProductModel> {
        val productList = listOf(
            Product("Digər mallar", 234.0, "l"),
            Product("Dini təyinatlı materiallar", 1.0, "əd")
        )
        return productList.map { it.toDomain() }
    }
}