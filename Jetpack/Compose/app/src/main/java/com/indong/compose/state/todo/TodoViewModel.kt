package com.indong.compose.state.todo

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {

    private var currentEditPosition by mutableStateOf(-1)

    // state: todoItems
    var todoItems: List<TodoItem> by mutableStateOf(listOf())
        private set

    val currentEditItem: TodoItem?
        get() = todoItems.getOrNull(currentEditPosition)

    // event: addItem
    fun addItem(item: TodoItem) {
        todoItems = todoItems + listOf(item)
    }

    // event: removeItem
    fun removeItem(item: TodoItem) {
        // toMutableList makes a mutable copy of the list we can edit, then
        // assign the new list to todoItems (which is still an immutable list)
        todoItems = todoItems.toMutableList().also {
            it.remove(item)
        }
        onEditDone()
    }

    // event: onEditItemSelected
    fun onEditItemSelected(item: TodoItem) {
        currentEditPosition = todoItems.indexOf(item)
    }

    // event: onEditDone
    fun onEditDone() {
        currentEditPosition = -1
    }

    // event: onEditItemChange
    fun onEditItemChange(item: TodoItem) {
        val currentItem = requireNotNull(currentEditItem)
        require(currentItem.id == item.id) {
            "You can only change an item with the same id as currentEditItem"
        }

        todoItems = todoItems.toMutableList().also {
            it[currentEditPosition] = item
        }
    }
}