package com.company.app.services

import com.company.app.repositories.UserRepository

class UserService {
    private val userRepository: UserRepository = UserRepository()

    fun getUser(id: Int): User {
        return userRepository.getUser(id)
    }
}