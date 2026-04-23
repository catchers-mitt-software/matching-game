package com.catchersmittsoftware.text

object TextProcessor {

    fun isHighSurrogate(ch: Char): Boolean {
        return ch in '\ud800'..<'\uDC00'
    }

    // TODO: Write tests for this
    fun isLowSurrogate(ch: Char): Boolean {
        return true
    }

    // TODO: Write tests for this
    fun isSurrogatePair(s: String): Boolean {
        return false
    }

}
