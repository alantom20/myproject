package com.tom

fun main(args: Array<String>) {
   // print("Hello Kotlin")
    val h  = Human()
    h.hello()
    var age = 19
    age = 20
    var height = 1.7f
    var name : String
    name = "Hank"
    println(name)
}
class Human{
    fun hello(){
        print("Hello Kotlin")
    }


}