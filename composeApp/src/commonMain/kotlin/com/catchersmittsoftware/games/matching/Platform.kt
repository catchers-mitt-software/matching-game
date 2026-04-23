package com.catchersmittsoftware.games.matching

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform