package com.catchersmittsoftware.text

object TextProcessor {

    fun isHighSurrogate(ch: Char): Boolean {
        return ch in '\ud800'..<'\udc00'
    }

    fun isLowSurrogate(ch: Char): Boolean {
        return ch in '\udc00'..<'\ue000'
    }

    // TODO: Write tests for this
    fun isSurrogatePair(s: String): Boolean {
        return false
    }

}
