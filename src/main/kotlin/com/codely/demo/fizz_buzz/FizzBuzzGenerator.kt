package com.codely.demo.fizz_buzz

class FizzBuzzGenerator {
    fun generate(value: Int) : String {
        if (value % 15 == 0) return "FizzBuzz"
        if (value % 3 == 0) return "Fizz"
        if (value % 5 == 0) return "Buzz"
        return value.toString()
    }
}