package com.codely.demo.fizz_buzz

private const val MULTIPLES_OF_THREE_MESSAGE = "Fizz"
private const val MULTIPLES_OF_FIVE_MESSAGE = "Buzz"
private const val MULTIPLES_OF_FIFTEEN_MESSAGE = "FizzBuzz"

class FizzBuzzGenerator {

    fun generate(value: Int): String {
        return when {
            (value % 15 == 0) -> MULTIPLES_OF_FIFTEEN_MESSAGE
            (value % 3 == 0) -> MULTIPLES_OF_THREE_MESSAGE
            (value % 5 == 0) -> MULTIPLES_OF_FIVE_MESSAGE
            else -> defaultMessage(value)
        }
    }

    private fun defaultMessage(value: Int): String {
        return value.toString()
    }
}