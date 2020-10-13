package com.tom


import java.util.*


fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
   // val scanner = Scanner(System.`in`)

    var number = 0
    while ( secret != number){
        print("Please enter is number: ")
        number = readLine()!!.toInt()
     //   number = scanner.nextInt();
        if(number < secret){
            println("high")
        }else if(number > secret){
            println("low")
        }else{
            println("bingo\t$secret ")
        }
    }


}