package com.company.app.repositories

import com.company.app.models.User

class UserRepository {
    fun getUser(id: Int): User {
        // Simulating a database query
        return User(id, "John Doe")
    }
}