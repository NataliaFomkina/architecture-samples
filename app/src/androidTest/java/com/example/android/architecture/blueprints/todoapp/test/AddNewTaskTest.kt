package com.example.android.architecture.blueprints.todoapp.test

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.rules.activityScenarioRule
import com.example.android.architecture.blueprints.todoapp.TodoActivity
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class AddNewTaskTest : TestCase() {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @get:Rule
    val activityRule = activityScenarioRule<TodoActivity>()

    @Test
    fun addNewTaskTest() = run{
            step("1. Запустить приложение") {
                ActivityScenario.launch(TodoActivity::class.java)
            }
//            step("Нет заметок по умолчанию") {
//                TasksScreen {
//                    noTasksText {
//                        isVisible()
//                        isDisplayed()
//                    }
//                }
//            }
        }
}