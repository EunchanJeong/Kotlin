package com.example.kotlinpractice1

fun main() {
    helloWorld()
    println(add(1, 2))
    StringT()
    maxBy1(1, 2)
    maxBy2(1, 2)
    checkNum(50)
    forAndWhile()


}

// 1. 함수
fun helloWorld() : Unit {
    println("Hello World!")
}


fun add(a : Int, b : Int) : Int {
    return a+b
}

// 2. val vs var
fun va() {
    val a : Int = 10
    var b : Int = 10

    b = 100

    val c = 100
    var d = 100

    var name = "Joyce"
}

// 3. String Template
fun StringT() {
    val name = "John"
    val lastName = "Ho"
    println("my name is ${name + lastName}. I'm 27.")
    println("${2==1}")
    println("this is 10\$")
}

// 4. 조건식
fun maxBy1(a : Int, b : Int) : Int {
    if(a > b) {
        return a
    }
    else {
        return b
    }
}

fun maxBy2(a : Int, b : Int) = if(a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("I don't know.")
    }

    // else를 항상 써주어야 한다.
    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not nad")
        else -> println("okay")
    }
}

// 5. Expression vs Statement
// 코틀린의 모든 함수는 Expression.
// if문을 Expression으로 사용할 수 있고 Statement으로도 사용할 수 있다.


// 6. Array and List

// Array

// List 1.List (읽기만 가능) 2. MutableList (읽기, 쓰기 모두 가능)

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 12L)

    array[0] = 3
    var result = list.get(0)

    val arrayList = arrayListOf<Int>() // MutableList
    arrayList.add(10)
    arrayList.add(2)
}

// 7. 반복문

fun forAndWhile() {
    val students = arrayListOf("철수", "케빈", "지수", "엘리")

    for ( name in students ) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index+1}번째 학생 : ${name}")
    }
    var sum = 0

    for ( i in 1..10 ) {
        sum += i
    }

    println(sum)

    for ( i in 10 downTo 1) {
        print(i)
    }
    println()

    for ( i in 1 until 10) {
        print(i)
    }
    println()

    var index = 0

    while(index < 10) {
        println("current index : ${index}")
        index += 1
    }
}

// 8. Nullable / NonNull

fun nullcheck() {
    // NPE : Null Pointer Exception

    var name = "John"

    var nllName : String? = null


}