package com.codely.demo.fizz_buzz.application

import com.codely.demo.fizz_buzz.domain.StandardOutput
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

internal class FizzBuzzServiceTest {
    private val mockedOutput = mock(StandardOutput::class.java)
    private val fizzBuzzService = FizzBuzzService(mockedOutput)

    @Test
    fun `printFirst100Numbers must call print from StandardOutput 100 times`() {
        fizzBuzzService.printFirst100Numbers()
        verify(mockedOutput, times(100)).print(anyString())
    }

    @Test
    fun `printFirst100Numbers must call print from StandardOutput 6 times with FizzBuzz message`() {
        fizzBuzzService.printFirst100Numbers()
        verify(mockedOutput, times(6)).print("FizzBuzz")
    }

    @Test
    fun `printFirst100Numbers must call print from StandardOutput 27 times with Fizz message`() {
        fizzBuzzService.printFirst100Numbers()
        verify(mockedOutput, times(27)).print("Fizz")
    }

    @Test
    fun `printFirst100Numbers must call print from StandardOutput 14 times with Buzz message`() {
        fizzBuzzService.printFirst100Numbers()
        verify(mockedOutput, times(14)).print("Buzz")
    }

    @Test
    fun `printFirst100Numbers must call print from StandardOutput 1 time with 1 message`() {
        fizzBuzzService.printFirst100Numbers()
        verify(mockedOutput, times(1)).print("1")
    }
}