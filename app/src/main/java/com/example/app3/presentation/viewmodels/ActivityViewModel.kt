package com.example.app3.presentation.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.app3.domain.usecases.GetProductDataUseCase
import com.example.app3.presentation.mapper.toUi
import com.example.app3.presentation.model.ProductUi
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ActivityViewModel @Inject constructor(var getProductDataUseCase: GetProductDataUseCase) : ViewModel() {

    private val _productData = mutableStateOf<List<ProductUi>>(emptyList())
    var productData: State<List<ProductUi>> = _productData


    init {
        getProductData()
    }

    fun getProductData() {
        _productData.value =  getProductDataUseCase().map { it.toUi() }
    }

}