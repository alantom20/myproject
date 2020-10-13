package com.tom

import java.util.*

fun main() {
    var random =Random().nextInt(10)+1
    val scanner = Scanner(System.`in`)
    println(random)
    var number = 0
    for (i in 1..4){
        print("Please enter a number(${i}/4) : ")
        var number = scanner.nextInt()
        if(number > random)
            println("low")
            else if(number < random)
            println("high")
        else {
            println("Great!,the number is $number")
            break
        }

    }
    print("結束")
}