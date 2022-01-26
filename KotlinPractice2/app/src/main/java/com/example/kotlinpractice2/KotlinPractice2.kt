package com.example.kotlinpractice2

fun main() {
    println(square(10))

    println()

    println(nameAge("John", 25))

    println()

    val a = "John said"
    val b = "Kevin said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println()

    print(extendString("Kim", 26))

    println()

    println(calculateGrade(94))

    println()

    val lamda = {number : Double -> number == 4.3213}

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))

    println()


}

// 1. Lamda
// 람다식은 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수 있다.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}

val nameAge  =  {name: String, age : Int -> "My name is ${name}, I'm ${age} years old."}

// 람다의 Return

val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfact"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}
// 2. 확장함수

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = { "I'm ${this} and ${it} years old"}
    return name.introduceMyself(age)
}