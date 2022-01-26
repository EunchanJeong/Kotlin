package com.example.kotlinpractice2

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// toString(), hashCode(), equals(), copy()

class TicketNomal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main() {
    val ticketA = Ticket("KoreanAir", "joyceHong", "2022-01-01", 17)
    val ticketB = TicketNomal("KoreanAir", "joyceHong", "2022-01-01", 17)

    println(ticketA)
    println(ticketB)
}