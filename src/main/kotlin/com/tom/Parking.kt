package com.tom

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter =
            LocalDateTime.of(2018,10,8,8,0)
    val leave =
            LocalDateTime.of(2018,10,8,10,8)
    val car = Car("AAA-002",enter)
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println(hours)
}
class Car(val id:String,val enter: LocalDateTime){
    var leave :LocalDateTime? = null
        set(value) {
            if(enter.isBefore(value)){
                field = value
            }
        }
    fun duration() = Duration.between(enter,leave).toMinutes()


}