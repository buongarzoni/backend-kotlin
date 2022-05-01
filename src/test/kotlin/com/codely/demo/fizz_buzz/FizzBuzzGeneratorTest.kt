package com.codely.demo.fizz_buzz

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FizzBuzzGeneratorTest {
    @Test
    fun `generate must return the value as String when is not multiple of 3 and 5`() {
        assertEquals("1", FizzBuzzGenerator().generate(1))
    }

   @Test
   fun `generate must return Fizz when value is multiple of 3`() {
       assertEquals("Fizz", FizzBuzzGenerator().generate(3))
   }

    @Test
    fun `generate must return Buzz when value is multiple of 5`() {
        assertEquals("Buzz", FizzBuzzGenerator().generate(5))
    }

    @Test
    fun `generate must return FizzBuzz when value is multiple of 15`() {
        assertEquals("FizzBuzz", FizzBuzzGenerator().generate(15))
    }
}