package com.saulglasman.mockkexample

object ExampleObject {

    private val exampleClass = ExampleClass()

    fun getExampleProperty(): Int = exampleClass.exampleProperty

}