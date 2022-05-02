package com.codely.demo.fizz_buzz.infrastructure

import com.codely.demo.fizz_buzz.IntegrationTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus

internal class FizzBuzzControllerTest: IntegrationTest() {

    @Test
    fun `controller must return status ok`() {
        val result = testRestTemplate.getForEntity("/fizzbuzz", String::class.java)
        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
    }
}