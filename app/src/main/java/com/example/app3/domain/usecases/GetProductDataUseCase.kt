package com.example.app3.domain.usecases

import com.example.app3.domain.interfaces.ProductRepository
import com.example.app3.domain.model.ProductModel
import javax.inject.Inject

class GetProductDataUseCase @Inject constructor(val productRepository: ProductRepository) {
    operator fun invoke(): List<ProductModel> {
        return productRepository.getProductData()

    }
}