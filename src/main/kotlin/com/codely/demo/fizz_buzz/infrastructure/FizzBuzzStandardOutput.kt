package com.codely.demo.fizz_buzz.infrastructure

import com.codely.demo.fizz_buzz.domain.StandardOutput
import org.springframework.stereotype.Component

@Component
class FizzBuzzStandardOutput: StandardOutput {
    override fun print(message: String) {
        println(message)
    }
}