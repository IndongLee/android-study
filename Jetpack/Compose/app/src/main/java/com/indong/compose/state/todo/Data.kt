package com.indong.compose.state.todo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CropSquare
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.PrivacyTip
import androidx.compose.material.icons.filled.RestoreFromTrash
import androidx.compose.ui.graphics.vector.ImageVector
import java.util.UUID

data class TodoItem(
    val task: String,
    val icon: TodoIcon = TodoIcon.Default,
    // since the user may generate identical tasks, give them each a unique ID
    val id: UUID = UUID.randomUUID()
)

enum class TodoIcon(val imageVector: ImageVector) {
    Square(Icons.Default.CropSquare),
    Done(Icons.Default.Done),
    Event(Icons.Default.Event),
    Privacy(Icons.Default.PrivacyTip),
    Trash(Icons.Default.RestoreFromTrash);

    companion object {
        val Default = Square
    }
}