package com.example.kotlinpractice1

class Human1(){

    val name = "John"

    fun eatingCake() {
        println("This is so delicious!!!")
    }
}

class Human2 constructor(name : String){

    val name = name

    fun eatingCake() {
        println("This is so delicious!!!")
    }
}

class Human3(val name : String){

    fun eatingCake() {
        println("This is so delicious!!!")
    }
}

class Human4(val name : String = "Kim"){

    init {
        println("Hello!!")
    }
    fun eatingCake() {
        println("This is so delicious!!!")
    }
}

open class Human5(val name : String = "Lee"){

    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }

    init {
        println("Hello!!")
    }
    fun eatingCake() {
        println("This is so delicious!!!")
    }

    open fun singASong() {
        println("LaLaLa~")
    }
}

class Korean : Human5() {
    override fun singASong() {
        super.singASong()
        println("랄랄랄~")
        println("My name is ${name}")
    }
}

fun main() {
    val human1 = Human1()
    human1.eatingCake()

    println("this human1's name is ${human1.name}")

    println()

    val human2 = Human2("Kevin")
    human2.eatingCake()

    println("this human2's name is ${human2.name}")

    println()

    val human3 = Human3("Ho")
    human3.eatingCake()

    println("this human3's name is ${human3.name}")

    println()

    val human4 = Human4()
    println("this human4's name is ${human4.name}")

    println()

    val human5 = Human5("Lee", 25)

    println()

    val kor = Korean()
    kor.singASong()
}