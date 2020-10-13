package com.tom

import java.util.*


data class Ticket(val origin:Int,val destination:Int,val price:Int)

fun main(args: Array<String>) {
    val ticket = Ticket(10,41,420);
    val s ="abcdef"
    println(s.validate())
    print((1..10).random())

}
fun String.validate() : Boolean{
    return this.length >=6
}
fun  IntRange.random() : Int{
    val r = Random().nextInt(endInclusive - start) + start
    return r
}