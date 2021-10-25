package com.example.testuserexo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun user_is_valid() {
        val user = User("yolo@gmail.com","yo","lo",15)
        assertTrue(user.isValid())
    }

    @Test
    fun should_be_false_given_12_yo_user() {
        val user = User("yolo@gmail.com","yo","lo",12)
        assertFalse(user.isValid())
    }

    @Test
    fun should_be_false_given_empty_name_user() {
        val user = User("yolo@gmail.com","","lo",14)
        assertFalse(user.isValid())
    }

    @Test
    fun should_be_false_given_empty_firstname_user() {
        val user = User("yolo@gmail.com","yo","",14)
        assertFalse(user.isValid())
    }
    @Test
    fun should_be_false_given_without_arobase_email_user() {
        val user = User("yolo","yo","lo",14)
        assertFalse(user.isValid())
    }
    @Test
    fun should_be_false_given_wrong_format_email_user() {
        val user = User("yolo@geg","yo","lo",14)
        assertFalse(user.isValid())
    }
}