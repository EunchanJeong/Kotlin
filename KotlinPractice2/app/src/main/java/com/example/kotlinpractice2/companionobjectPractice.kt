package com.example.kotlinpractice2

/*
companion object
JAVA의 static 대신에 사용되는 것으로 정적인 메소드나 정적인 변수를 선언할 때 사용한다.
 */

class Book1 private constructor(val id : Int, val name : String) {

    companion object {
        fun create() = Book1(0, "animal farm")
    }
}

class Book2 private constructor(val id : Int, val name : String) {

    companion object {
        val myBook = "new Book"

        fun create() = Book2(0, myBook)
    }
}

class Book3 private constructor(val id : Int, val name : String) {

    companion object BookFactory : idProvider {

        override fun getId() : Int {
            return 444
        }

        val myBook = "new Book"

        fun create() = Book3(getId(), myBook)
    }
}

interface idProvider {
    fun getId() : Int
}

fun main() {
    val book1 = Book1.create()
    println("${book1.id} ${book1.name}")

    println()

    val book2 = Book2.create()
    println("${book2.id} ${book2.name}")

    println()

    val book3 = Book3.create()
    println("${book3.id} ${book3.name}")

    val book3Id = Book3.BookFactory.getId()
    println(book3Id)

    println()
}