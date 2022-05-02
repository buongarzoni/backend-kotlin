package com.codely.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KatasApplication

fun main(args: Array<String>) {
    SpringApplication.run(KatasApplication::class.java, *args)
}
