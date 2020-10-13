package com.tom

fun main(args: Array<String>) {
   // print("Hello Kotlin")
    var s : String? = "abcde"
    s = null
    println(s?.substring(2))
    val h  = Human(66.5f,1.7f)
    println(h.bmi())

   /* var age = 19
    age = 20
    var height = 1.7f
    var name : String
    name = "Hank"
    println(name)
    */
}
class Human(var weight : Float,var height : Float ,var name : String = ""){
    init {
        println("test$weight")
    }
//    constructor(name:String,weight: Float,height: Float):this(weight,height)
    fun hello(){
        print("Hello Kotlin")
    }
    fun bmi() : Float{
        val bmi : Float
        bmi = weight/(height*height)
        return  bmi

    }
}