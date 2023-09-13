package programing_2

import kotlin.random.Random
import kotlin.random.nextInt

fun rockPaperScissors() {
    while (true) {

        //these are the inputs for rock paper scissors
        println("Rock, Paper or Scissors?")
        val input = readln().lowercase()

        val computer = when (Random.nextInt(0,3)){ //for some reason the last number here is ignored, so it needs to be (0, real number + 1)
            0 -> "rock"
            1 -> "paper"
            2 -> "scissors"
            else -> {"error"}
        }

        //here is the logic for rock paper scissors
        val result = when (input) {
            computer -> "draw"
            "rock" -> if (computer == "paper") "Loss!" else "Win!"
            "paper" -> if (computer == "scissors") "loss!" else "Win!"
            "scissors" -> if (computer == "rock") "Loss!" else "Win!"
            else -> "error"
        }

        //this is all a fancy way to print the result
        wait(0.3f)
        println("|| the computer picked: $computer||")
        wait(0.3f)

        newLine() //this is a custom function that is a cleaner println("") function
        println("||its a $result||")
        newLine()
    }
}

fun wait(seconds: Float) {
    Thread.sleep((seconds*1000).toLong()) //didn't want to keep typing this out
}