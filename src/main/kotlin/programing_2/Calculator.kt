package programing_2

import kotlin.math.pow

fun calculator() {
    while (true) { //forever loop

        val input = readln() // gets the users input

        val inputAsArray: List<String> = input.split(" ") //splits the users input into an array of strings "first number", "operation", "second number"

        when (inputAsArray[1]) { // remember the first number in an array is 0
            "^" -> println(inputAsArray[0].toFloat().pow(inputAsArray[2].toFloat()))
            "*" -> println(inputAsArray[0].toFloat()*(inputAsArray[2].toFloat()))
            "/" -> println(inputAsArray[0].toFloat()/(inputAsArray[2].toFloat()))
            "+" -> println(inputAsArray[0].toFloat()+(inputAsArray[2].toFloat()))
            "-" -> println(inputAsArray[0].toFloat()-(inputAsArray[2].toFloat()))
        }
    }
}