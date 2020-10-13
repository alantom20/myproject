package com.tom

import java.util.*

fun main(args: Array<String>) {
    //userInput()
    val gstu = GraduateStudent("Jack",60,65,62)
    gstu.print()
    Student.pass = 50
    val stu1 = Student("Peter", 60, 50)
    stu1.print()
    val stu2 = Student("Hank", 30, 50)
    stu2.print()
    val stu3 = Student("Tank", 60, 40)
    stu3.print()
    val stu4 = Student("Eric", 80, 20)
    stu4.print()
    print("High score :${stu1.highest()}")
}
class GraduateStudent(name:String,english: Int,math: Int,var thesis:Int) : Student(name, english, math){
   companion object{
       var pass = 70
   }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() =  if(getAverage() >= pass ) "PASS" else "FAIL"


}
open class Student(var name : String?,var english : Int,var math : Int ){
    companion object{
        @JvmStatic
        var pass = 60
        fun test(){
            print("test")
        }
    }
    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")

    }
    fun grading()  = when(getAverage()){
        in 90..100->'A'
        in 80..89->'B'
        in 70..79->'C'
        in 60..69->'D'
        else ->'F'
    }
    open fun passOrFailed() = if(getAverage() >= pass ) "PASS" else "FAIL"


    fun getAverage()  = (english+math)/2

    fun highest() = if (english > math) {
        println("english ")
        english
    }else {
        println("math ")
        math
    }




}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student name : ")
    var name = null
    print("Please enter student english : ")
    var english = scanner.nextInt()
    print("Please enter student math : ")
    var math = scanner.nextInt()

    val stu = Student(name, english, math)
    stu.print()
}

