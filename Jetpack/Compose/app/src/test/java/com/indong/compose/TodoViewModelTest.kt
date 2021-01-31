package com.indong.compose

import com.indong.compose.state.todo.TodoViewModel
import com.indong.compose.state.util.generateRandomTodoItem
import org.junit.Test

class TodoViewModelTest {
    @Test
    fun whenRemovingItem_updatesList() {
        // before
        val viewModel = TodoViewModel()
        val item1 = generateRandomTodoItem()
        val item2 = generateRandomTodoItem()
        viewModel.addItem(item1)
        viewModel.addItem(item2)

        // during
        viewModel.removeItem(item1)

        // after
        assert(viewModel.todoItems == listOf(item2))
    }
}