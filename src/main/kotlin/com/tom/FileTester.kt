package com.tom

import java.io.File

fun main(args: Array<String>) {
    //File("data.txt").writeText("abc123")
    //write()
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }


}

private fun write() {
    File("data.txt").bufferedWriter().use {
       it.write("1st line\n")
       it.write("2st line\n")
       it.write("3st line\n")
    }
}