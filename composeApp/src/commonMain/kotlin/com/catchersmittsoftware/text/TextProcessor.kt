package com.catchersmittsoftware.text

object TextProcessor {

    fun isHighSurrogate(ch: Char): Boolean {
        return ch in '\ud800'..<'\uE000'
    }

    fun isLowSurrogate(ch: Char): Boolean {
        return ch in '\udc00'..<'\uE000'
    }

    // TODO: Write tests for this
    fun isSurrogatePair(s: String): Boolean {
        return false
    }

}
