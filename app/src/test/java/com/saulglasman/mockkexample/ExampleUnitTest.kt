package com.saulglasman.mockkexample

import io.mockk.every
import io.mockk.mockkConstructor
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MockkExampleTest {

    @Before fun setup() {
        mockkConstructor(ExampleClass::class)
        every {anyConstructed<ExampleClass>().exampleProperty} returns 0
    }

    @Test fun test1() {
        assertEquals(0, ExampleObject.getExampleProperty())
    }

    @Test fun test2() {
        assertEquals(0, ExampleObject.getExampleProperty())
    }
}