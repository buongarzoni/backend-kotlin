package com.codely.demo.fizz_buzz.application

import com.codely.demo.fizz_buzz.domain.FizzBuzzGenerator
import com.codely.demo.fizz_buzz.domain.StandardOutput
import org.springframework.stereotype.Service

@Service
class FizzBuzzService(private val standardOutput: StandardOutput) {
    private val fizzBuzzGenerator = FizzBuzzGenerator()

    fun printFirst100Numbers(){
        for(value in (1..100)) {
            standardOutput.print(fizzBuzzGenerator.generate(value))
        }
    }
}