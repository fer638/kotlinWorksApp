package com.jorgefer.kotlinworks

sealed class TaskCategory {
    object  Personal : TaskCategory()
    object Bussines : TaskCategory()
    object Other : TaskCategory()
}

