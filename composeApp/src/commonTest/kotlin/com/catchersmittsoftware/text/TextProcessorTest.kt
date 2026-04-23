package com.catchersmittsoftware.text

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue
import kotlin.test.fail

class TextProcessorTest {

    @Test
    fun testIsHighSurrogate() {
        val num = (0xD800 .. 0xDBFF).random()
        val ch: Char = num.toChar()
        val message =
            "Character $ch (${num.toHexString()}) should be high surrogate"
        assertTrue(TextProcessor.isHighSurrogate(ch), message)
    }

    @Test
    fun testIsNotHighSurrogate() {
        val num = (0x0020 .. 0xD800).random()
        val ch: Char = num.toChar()
        val message =
            "Character $ch (${num.toHexString()}) should not be high surrogate"
        assertFalse(TextProcessor.isHighSurrogate(ch), message)
    }

    @Test
    fun testIsLowSurrogate() {
        val num = (0xDC00 .. 0xDFFF).random()
        val ch: Char = num.toChar()
        val message =
            "Character $ch (${num.toHexString()}) should be low surrogate"
        assertTrue(TextProcessor.isLowSurrogate(ch), message)
    }

    @Test
    fun testIsNotLowSurrogate() {
        val num = (0x0020 .. 0xD800).random()
        val ch: Char = num.toChar()
        val message =
            "Character $ch (${num.toHexString()}) should not be low surrogate"
        assertFalse(TextProcessor.isLowSurrogate(ch), message)
    }

    @Test
    fun testLowSurrogateIsNotHighSurrogate() {
        val num = (0xDC00 .. 0xDFFF).random()
        val ch: Char = num.toChar()
        val message =
            "Character $ch (${num.toHexString()}) should not be high surrogate"
        assertFalse(TextProcessor.isHighSurrogate(ch), message)
    }

    @Test
    fun testHighSurrogateIsNotLowSurrogate() {
        val num = (0xD800 .. 0xDBFF).random()
        val ch: Char = num.toChar()
        val message =
            "Character $ch (${num.toHexString()}) should not be low surrogate"
        assertFalse(TextProcessor.isLowSurrogate(ch), message)
    }

}
