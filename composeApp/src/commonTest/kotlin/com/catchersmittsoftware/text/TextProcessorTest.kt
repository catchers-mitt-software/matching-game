package com.catchersmittsoftware.text

import kotlin.test.Test
import kotlin.test.assertTrue

class TextProcessorTest {

    @Test
    fun testIsHighSurrogate() {
        val num = (0xD800 .. 0xDBFF).random()
        val ch: Char = num.toChar()
        val message =
            "Character $ch (${num.toHexString()}) should be high surrogate"
        assertTrue(TextProcessor.isHighSurrogate(ch), message)
    }

}
