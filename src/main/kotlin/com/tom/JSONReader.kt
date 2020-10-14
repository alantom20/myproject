package com.tom

import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.net.URL

fun main(args: Array<String>) {

    val url =URL("http://atm201605.appspot.com/h")
    print(url.readText())
    /*val br = url.openStream()
    val bf = BufferedReader(InputStreamReader(br))
    val sb = StringBuilder()
    for (line in bf.lines()) {
        sb.append(line)
    }
    print(sb.toString())*/


}