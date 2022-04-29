package com.example.android.finalyearproject.customer.createTask

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.android.finalyearproject.repository.TaskRepository
import com.example.android.finalyearproject.repository.UserRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class CreateTaskViewmodelFactory(private val taskRepo: TaskRepository, private val userRepo: UserRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CreateTaskViewmodel::class.java)) {
            return CreateTaskViewmodel(taskRepo, userRepo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}