package com.tom

import java.io.CharArrayReader
import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkingLot = HashMap<String,Car?>()
    var enter = LocalDateTime.of(2018,10,2,8,0)
    var car : Car?  = Car("AAA-001",enter)
    parkingLot.put(car!!.id,car)
    car = Car("BBB-002",enter.plusMinutes(15))
    parkingLot.put(car.id,car)
    //Car 1 Leaving
    var leave = LocalDateTime.of(2018,10,2,9,0)
    car = parkingLot.get("AAA-001")
    car?.leave = leave
    println("${car?.id}, duration:${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
    car = parkingLot.get("BBB-002")
    car?.leave =leave.plusHours(2)
    println("${car?.id}, duration:${car?.duration()}")
    parkingLot.remove(car?.id)
    print(parkingLot.size)







    /*val list = listOf(5,2,3,4,6)
    println(list)
    val scores = listOf(60,90,50,30,35)
    for (score in scores){
        println(score)
    }
    println(scores.get(2))
    val mutableList = mutableListOf(85,20,64,84,97)
    mutableList.add(54)
    println(mutableList)*/

}