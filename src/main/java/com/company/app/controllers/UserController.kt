package com.company.app.controllers

import com.company.app.services.UserService

class UserController {
    private val userService: UserService = UserService()

    fun getUser(id: Int) {
        val user = userService.getUser(id)
        println(user)
    }
}