package com.example.kotlinpractice2

// Singleton Pattern (모든 앱을 실행할 때 딱 한번만 만들어진다.)
object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main() {
    val car1 = CarFactory.makeCar(150)
    val car2 = CarFactory.makeCar(200)

    println(car1)
    println(car2)
    println(CarFactory.cars.size.toString())
}