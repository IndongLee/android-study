package com.indong.compose.state.util

import com.indong.compose.state.todo.TodoIcon
import com.indong.compose.state.todo.TodoItem

fun generateRandomTodoItem(): TodoItem {
    val message = listOf(
        "Learn compose",
        "Learn state",
        "Build dynamic UIs",
        "Learn Unidirectional Data Flow",
        "Integrate LiveData",
        "Integrate ViewModel",
        "Remember to savedState!",
        "Build stateless composables",
        "Use state from stateless composables"
    ).random()
    val icon = TodoIcon.values().random()
    return TodoItem(message, icon)
}

fun main() {
    val list = listOf(1, 2, 3)
    var currentCount = 0
    for (item in list) {
        currentCount += item
        println(currentCount)
    }
}