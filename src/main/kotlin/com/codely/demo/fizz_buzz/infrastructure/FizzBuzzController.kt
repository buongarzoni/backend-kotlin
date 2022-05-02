package com.codely.demo.fizz_buzz.infrastructure

import com.codely.demo.fizz_buzz.application.FizzBuzzService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FizzBuzzController(private val fizzBuzzService: FizzBuzzService) {

    @GetMapping("/fizzbuzz")
    fun fizzBuzz() {
        fizzBuzzService.printFirst100Numbers()
    }
}