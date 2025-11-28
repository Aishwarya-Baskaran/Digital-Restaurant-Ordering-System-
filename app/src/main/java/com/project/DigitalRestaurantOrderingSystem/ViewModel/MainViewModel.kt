package com.DigitalRestaurantOrderingSystem.DigitalRestaurantOrderingSystem2402.ViewModel

import android.R
import androidx.lifecycle.LiveData
import com.DigitalRestaurantOrderingSystem.DigitalRestaurantOrderingSystem2402.Domain.CategoryModel
import com.DigitalRestaurantOrderingSystem.DigitalRestaurantOrderingSystem2402.Domain.FoodModel
import com.DigitalRestaurantOrderingSystem.DigitalRestaurantOrderingSystem2402.Repository.MainRepository

class MainViewModel {
    private val repository = MainRepository()

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadBestFood(): LiveData<MutableList<FoodModel>> {
        return repository.loadBestFood()
    }

    fun loadFiltered(id: String): LiveData<MutableList<FoodModel>>{
        return repository.loadFiltered(id)
    }
}
