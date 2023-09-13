package programing_2

import i
import input
import progr2aming_2.random

fun magic8Ball() {
    println("do you want a pessimistic, optimistic, or normal magic 8 ball?")
    input = readln().lowercase()//input is a global variable defined in the main file

    println("what is your question?")
    val unused = readln() //just making it kinda like a real magic 8-ball

    when(input) {
        "pessimistic" -> println(getDataBase("magic8Ball")[random(14, 19)])
        "optimistic" -> println(getDataBase("magic8Ball")[random(0, 9)])
        "normal" -> println(getDataBase("magic8Ball")[random(0, 19)])
    }
    newLine()//just making it look a bit better in the console
}

private fun getDataBase(name: String):Array<String> {
    val  magic8Ball = arrayOf(
        "You may rely on it.It is certain.",
        "It is decidedly so.",
        "Without a doubt.",
        "Yes definitely.",
        "You may rely on it.",
        "As I see it, yes.",
        "Most likely.",
        "Outlook good. ",
        "Yes.",
        "Signs point to yes ",
        "Reply hazy, try again.",
        "Ask again later.",
        "Better not tell you now.",
        "Cannot predict now.",
        "Concentrate and ask again. ",
        "Don't count on it.",
        "My reply is no.",
        "My sources say no.",
        "Outlook not so good."
    )
    return when (name) {
        "magic8Ball" -> magic8Ball
        else -> {
            arrayOf("database error")
        }
    }
}