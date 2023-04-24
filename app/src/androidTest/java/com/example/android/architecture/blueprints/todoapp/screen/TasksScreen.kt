package com.example.android.architecture.blueprints.todoapp.screen

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.text.KTextView

object TasksScreen : KScreen<TasksScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val noTasksIcon = KImageView {withContentDescription("No tasks image")}
    val noTasksText = KTextView {withText("You have no tasks!")}
}